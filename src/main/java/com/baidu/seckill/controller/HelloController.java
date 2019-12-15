package com.baidu.seckill.controller;

import com.baidu.seckill.dao.SecKillDao;
import com.baidu.seckill.mapper.SecKillMapper;
import com.baidu.seckill.pojo.SecKill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @Auther:zcf
 * @Date:2019/12/13
 * @Descirption:com.baidu.seckill.controller
 * @version:1.0
 */
@RestController
public class HelloController {
    @Autowired
    private SecKillMapper secKillMapper;
    @Autowired
    private SecKillDao secKillDao;

    @RequestMapping("/select/{id}")
    public String hello(@PathVariable("id") long id){
        SecKill secKill=secKillMapper.selectByPrimaryKey(id);
        if(secKill==null){
            return "秒杀商品不存在";
        }else {
            return secKill.getName()+"-->当前库存："+secKill.getNumber();
        }
    }


    @RequestMapping("/reduce/{id}")
    public String reduce(@PathVariable("id") long id){
        int i=secKillDao.reduceNumber(id,new Date());
        if(i <=0){
            return "秒杀失败";
        }else {
            SecKill secKill=secKillMapper.selectByPrimaryKey(id);
            return secKill.getName()+"-->当前库存："+secKill.getNumber();
        }
    }

    @RequestMapping("/queryall")
    public List<SecKill> queryAll(){
        List<SecKill> secKills = secKillDao.queryAll(0, 5);
        return secKills;
    }


}
