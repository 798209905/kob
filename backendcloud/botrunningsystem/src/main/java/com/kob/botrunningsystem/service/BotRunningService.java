package com.kob.botrunningsystem.service;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/9/4 9:50
 */
public interface BotRunningService {
    String addBot(Integer userId, String botCode, String input);
}
