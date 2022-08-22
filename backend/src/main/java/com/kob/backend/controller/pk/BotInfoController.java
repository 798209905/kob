package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/8/22 16:25
 */

@RestController
@RequestMapping("/pk/")
public class BotInfoController {

    @RequestMapping("getbotinfo/")
    public List getBotInfo(){
        List<String> list = new LinkedList<>();

        list.add("sword");
        list.add("app");
        list.add("cat");

        return list;
    }
}
