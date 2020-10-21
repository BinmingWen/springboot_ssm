package com.gec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 温明彬
 * @company cn.wyu
 * @Description : //描述
 * @ClassName : Ssm  //类名
 * @date 2020/10/21 10:41
 */
@SpringBootApplication
@MapperScan("com.gec.mapper")
public class Ssm {
    public static void main(String[] args) {
        SpringApplication.run(Ssm.class,args);
    }
}
