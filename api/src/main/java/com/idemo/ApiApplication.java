package com.idemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication          //该app为springboot应用
@EnableCaching                  //缓存注解开启
@EnableTransactionManagement    //事务直接开启
@MapperScan("com.idemo.mapper") //dao层扫描
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
