package edu.nf.yxdsso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.nf.yxdsso.mapper")
public class YxdssoApplication {

    public static void main(String[] args) {
        SpringApplication.run(YxdssoApplication.class, args);
    }

}
