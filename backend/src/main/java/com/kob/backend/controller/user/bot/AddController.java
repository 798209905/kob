package com.kob.backend.controller.user.bot;

import com.kob.backend.service.user.bot.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/8/31 15:19
 */
@RestController
public class AddController {
    @Autowired
    private AddService addService; //注入接口

    @PostMapping("/user/bot/add/")
    public Map<String,String> add(@RequestParam Map<String, String> data){
        return addService.add(data);
    }

}
