package com.kob.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backend.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/8/29 12:46
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
