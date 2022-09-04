package com.kob.botrunningsystem.service.impl;

import com.kob.botrunningsystem.service.BotRunningService;
import com.kob.botrunningsystem.service.impl.utils.BotPool;
import org.springframework.stereotype.Service;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/9/4 9:52
 */
@Service
public class BotRunningServiceImpl implements BotRunningService {
    public final static BotPool botPool = new BotPool();

    @Override
    public String addBot(Integer userId, String botCode, String input) {
        System.out.println("add bot" + userId + " " + botCode + " " + input);
        botPool.addBot(userId,botCode,input);
        return "addBot success";
    }
}
