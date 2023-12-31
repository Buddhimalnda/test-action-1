package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class DemoApplication {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

//    echo "# test-action-1" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/Buddhimalnda/test-action-1.git
//    git push -u origin main
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
