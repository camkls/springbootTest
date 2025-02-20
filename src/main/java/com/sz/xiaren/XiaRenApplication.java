package com.sz.xiaren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class XiaRenApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaRenApplication.class, args);
    }

}
