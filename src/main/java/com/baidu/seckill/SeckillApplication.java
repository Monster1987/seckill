package com.baidu.seckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.baidu.seckill"})
@MapperScan({"com.baidu.seckill.mapper","com.baidu.seckill.dao"})

public class SeckillApplication {


    public static void main(String[] args) {
        SpringApplication.run(SeckillApplication.class, args);
        System.out.println("SpringBoot项目已启动");
    }

}
