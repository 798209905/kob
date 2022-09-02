package com.kob.backend.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backend.pojo.Record;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author rickxu
 * @version 1.0
 * @date 2022/9/2 22:25
 */
@Mapper
public interface RecordMapper extends BaseMapper<Record> {
}
