package com.kob.backend.service.impl.user.bot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kob.backend.mapper.BotMapper;
import com.kob.backend.pojo.Bot;
import com.kob.backend.pojo.User;
import com.kob.backend.service.impl.utils.UserDetailsImpl;
import com.kob.backend.service.user.bot.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/8/31 14:55
 */
@Service
public class AddServiceImpl implements AddService {

    @Autowired
    private BotMapper botMapper;

    @Override
    public Map<String, String> add(Map<String, String> data) {
        UsernamePasswordAuthenticationToken authenticationToken =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticationToken.getPrincipal();
        User user = loginUser.getUser();

        String title = data.get("title");
        String description = data.get("description");
        String content = data.get("content");

        Map<String, String> map = new HashMap<>();

        if(title == null || title.length() == 0){
            map.put("error_message", "标题不能为空");
            return map;
        }
        if(title.length() > 101){
            map.put("error_message", "标题长度小于100");
            return map;
        }
        if(description == null || description.length() == 0){
            description = "这个用户很懒，啥也没留下-.-";
        }
        if(description.length() > 301){
            map.put("error_message", "Bot描述不能大于300");
            return map;
        }
        if(content == null || content.length() == 0){
            map.put("error_message", "代码不能为空");
            return map;
        }
        if(description.length() > 10001){
            map.put("error_message", "代码长度小于10000");
            return map;
        }

        QueryWrapper<Bot> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", user.getId());
        if(botMapper.selectCount(queryWrapper) >= 5){
            map.put("error_message","最多只能创建五个Bot，想要再创建，得加钱（不是，开玩笑的:)");
            return map;
        }

        Date now = new Date();
        Bot bot = new Bot(null, user.getId(),title,description,content,now,now);

        botMapper.insert(bot);
        map.put("error_message", "success");

        return map;
    }
}
