package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
新增中文注释
 */

@SpringBootApplication
public class SpringbootMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMqApplication.class, args);
    }

    public void test(){
        System.out.println("test你好");
    }
    
    //新增了一个add方法
    public void add(){
        //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        System.out.println("新增add");
    }



}
