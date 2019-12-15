package com.baidu.seckill.controller;

import com.baidu.seckill.dao.SecKillMapper;
import com.baidu.seckill.pojo.SecKill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping("/hello")
    public String hello(){
        SecKill secKill=secKillMapper.selectByPrimaryKey(4L);
        if(secKill==null){
            return "秒杀商品不存在";
        }else {
            return secKill.getName();
        }
    }
}
