package com.example.dialogue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@MapperScan
@SpringBootApplication
public class DialogueApplication {
    public static void main(String[] args) {
        SpringApplication.run(DialogueApplication.class, args);
    }


}
