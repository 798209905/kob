package com.kob.matchingsystem.service;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/9/3 12:39
 */
public interface MatchingService {
    String addPlayer(Integer userId, Integer rating);
    String removePlayer(Integer userId);
}
