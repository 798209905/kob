package com.kob.backend.service.record;

import com.alibaba.fastjson.JSONObject;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/9/4 21:21
 */
public interface GetRecordListService {
    JSONObject getList(Integer page);
}
