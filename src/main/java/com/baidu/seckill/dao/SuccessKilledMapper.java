package com.baidu.seckill.dao;

import com.baidu.seckill.pojo.SuccessKilled;
import com.baidu.seckill.pojo.SuccessKilledExample;
import com.baidu.seckill.pojo.SuccessKilledKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuccessKilledMapper {
    long countByExample(SuccessKilledExample example);

    int deleteByExample(SuccessKilledExample example);

    int deleteByPrimaryKey(SuccessKilledKey key);

    int insert(SuccessKilled record);

    int insertSelective(SuccessKilled record);

    List<SuccessKilled> selectByExample(SuccessKilledExample example);

    SuccessKilled selectByPrimaryKey(SuccessKilledKey key);

    int updateByExampleSelective(@Param("record") SuccessKilled record, @Param("example") SuccessKilledExample example);

    int updateByExample(@Param("record") SuccessKilled record, @Param("example") SuccessKilledExample example);

    int updateByPrimaryKeySelective(SuccessKilled record);

    int updateByPrimaryKey(SuccessKilled record);
}