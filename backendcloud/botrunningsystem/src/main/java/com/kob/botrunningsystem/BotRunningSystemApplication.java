package com.kob.botrunningsystem;

import com.kob.botrunningsystem.service.impl.BotRunningServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/9/4 9:45
 */
@SpringBootApplication
public class BotRunningSystemApplication {
    public static void main(String[] args){
        BotRunningServiceImpl.botPool.start();
        SpringApplication.run(BotRunningSystemApplication.class,args);
    }
}
