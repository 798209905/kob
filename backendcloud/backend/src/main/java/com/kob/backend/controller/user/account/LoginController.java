package com.kob.backend.controller.user.account;

import com.kob.backend.service.user.account.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/8/29 16:35
 */

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/api/user/account/token/")
    public Map<String ,String> getToken(@RequestParam Map<String, String > map) {
        String username = map.get("username");
        String password = map.get("password");
        return loginService.getToken(username,password);
    }

}
