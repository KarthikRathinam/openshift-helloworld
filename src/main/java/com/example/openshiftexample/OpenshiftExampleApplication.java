package com.example.openshiftexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

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
    
    @RequestMapping(
            value = "/process",
            method = RequestMethod.POST,
            consumes = "text/plain")
    public String process(@RequestBody String payload) throws Exception {

        return payload;
    
    }
    
    public static void main(String[] args) {
        SpringApplication.run(OpenshiftExampleApplication.class, args);
    }

}
