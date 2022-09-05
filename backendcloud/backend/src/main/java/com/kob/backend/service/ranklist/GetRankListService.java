package com.kob.backend.service.ranklist;

import com.alibaba.fastjson.JSONObject;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/9/5 11:48
 */
public interface GetRankListService {
    JSONObject getList(Integer page);
}
