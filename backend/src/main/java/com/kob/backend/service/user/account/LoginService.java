package com.kob.backend.service.user.account;

import java.util.Map;


/**
 * @author rickxu
 * @version 1.0
 * @date 2022/8/29 16:19
 */
public interface LoginService {
    public Map<String,String> getToken(String username, String password);
}
