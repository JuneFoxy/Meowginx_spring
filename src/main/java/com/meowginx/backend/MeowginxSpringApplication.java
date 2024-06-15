package com.meowginx.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({
        "com.meowginx.backend.config",
        "com.meowginx.backend.region"
})
@SpringBootApplication
public class MeowginxSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeowginxSpringApplication.class, args);
    }

}
