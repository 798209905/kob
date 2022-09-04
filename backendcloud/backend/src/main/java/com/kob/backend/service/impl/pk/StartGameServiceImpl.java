package com.kob.backend.service.impl.pk;

import com.kob.backend.consumer.WebSocketServer;
import com.kob.backend.service.pk.StartGameService;
import org.springframework.stereotype.Service;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/9/3 15:46
 */
@Service
public class StartGameServiceImpl implements StartGameService {
    @Override
    public String startGame(Integer aId, Integer aBotId, Integer bId, Integer bBotId) {
        System.out.println("start game" + aId + " " + aBotId + "" +bId + " " + bBotId);
        WebSocketServer.startGame(aId,aBotId,bId,bBotId);
        return "start game success";
    }
}
