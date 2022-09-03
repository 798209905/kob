package com.kob.backend.service.user.account;

import java.util.Map;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/8/29 16:20
 */
public interface RegisterService {
    public Map<String,String> register(String username, String password, String confirmedPassword);
}
