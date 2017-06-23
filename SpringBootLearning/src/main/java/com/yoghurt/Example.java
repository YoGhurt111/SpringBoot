package com.yoghurt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by admin on 2017/6/21.
 */
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication// 相当于@Configuration，@EnableAutoConfiguration，@ComponentScan
public class Example {

    public static void main(String[] args){
        SpringApplication.run(Example.class, args);
    }
}
