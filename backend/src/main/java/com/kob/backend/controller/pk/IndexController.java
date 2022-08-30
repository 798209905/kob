package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/8/22 16:16
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){

        return "pk/index.html";
    }
}
