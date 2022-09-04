package com.kob.matchingsystem.service.impl;

import com.kob.matchingsystem.MatchingSystemApplication;
import com.kob.matchingsystem.service.MatchingService;
import com.kob.matchingsystem.service.impl.utils.MatchingPool;
import org.springframework.stereotype.Service;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/9/3 12:40
 */
@Service
public class MatchingServiceImpl implements MatchingService {

    public final static MatchingPool matchingpool = new MatchingPool();
    @Override
    public String addPlayer(Integer userId, Integer rating,Integer botId) {
        System.out.println("add player: "+ userId+ " "+ rating);
        matchingpool.addPlayer(userId, rating, botId);
        return "add player success";
    }

    @Override
    public String removePlayer(Integer userId) {
        System.out.println("remove player: "+ userId);
        matchingpool.removePlayer(userId);
        return "remove success";
    }
}
