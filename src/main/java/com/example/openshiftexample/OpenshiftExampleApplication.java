package com.example.openshiftexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftExampleApplication {

    @GetMapping("/")
    public String welcome() {
        return "welcome to Openshift example";
    }

    @GetMapping("/{input}")
    public String welcome(@PathVariable String input) {
        return "Hi " + input +" welcome to Openshift example";
    }

    public static void main(String[] args) {
        SpringApplication.run(OpenshiftExampleApplication.class, args);
    }

}