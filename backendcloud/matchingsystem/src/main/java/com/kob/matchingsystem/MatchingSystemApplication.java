package com.kob.matchingsystem;

import com.kob.matchingsystem.service.impl.MatchingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/9/3 13:02
 */
@SpringBootApplication
public class MatchingSystemApplication {
    public static void main(String[] args){
        MatchingServiceImpl.matchingpool.start();   //启动匹配线程
        SpringApplication.run(MatchingSystemApplication.class,args);
    }
}
