package com.kob.backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kob.backend.mapper.Usermapper;
import com.kob.backend.pojo.User;
import com.kob.backend.service.impl.utils.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/8/29 13:53
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private Usermapper usermapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        User user = usermapper.selectOne(queryWrapper);
        if(user == null){
            throw  new RuntimeException("用户不存在");
        }
        return new UserDetailsImpl(user);
    }


}
