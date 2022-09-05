package com.kob.backend.controller.user.account;

import com.kob.backend.service.user.account.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/8/29 17:08
 */
@RestController
public class InfoController {
    @Autowired
    private InfoService infoService;

    @GetMapping("/api/user/account/info/")
    public Map<String,String> getinfo(){
        return infoService.getinfo();
    }
}
