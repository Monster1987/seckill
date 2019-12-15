package com.baidu.seckill.dao;

import com.baidu.seckill.pojo.SecKill;
import com.baidu.seckill.pojo.SecKillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SecKillMapper {
    long countByExample(SecKillExample example);

    int deleteByExample(SecKillExample example);

    int deleteByPrimaryKey(Long seckillId);

    int insert(SecKill record);

    int insertSelective(SecKill record);

    List<SecKill> selectByExample(SecKillExample example);

    SecKill selectByPrimaryKey(Long seckillId);

    int updateByExampleSelective(@Param("record") SecKill record, @Param("example") SecKillExample example);

    int updateByExample(@Param("record") SecKill record, @Param("example") SecKillExample example);

    int updateByPrimaryKeySelective(SecKill record);

    int updateByPrimaryKey(SecKill record);
}