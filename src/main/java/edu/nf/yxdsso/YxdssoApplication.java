package edu.nf.yxdsso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.SecureRandom;
import java.util.Base64;

@SpringBootApplication
@MapperScan("edu.nf.yxdsso.mapper")
public class YxdssoApplication {

    public static void main(String[] args) {
        /**
         * 256 bits
         */
        byte[] key = new byte[32];
        new SecureRandom().nextBytes(key);
        String encodedKey = Base64.getEncoder().encodeToString(key);
        System.out.println("encodedKey:" + encodedKey);
        SpringApplication.run(YxdssoApplication.class, args);
    }

}
