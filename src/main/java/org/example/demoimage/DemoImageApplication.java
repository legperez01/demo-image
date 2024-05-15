package org.example.demoimage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoImageApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoImageApplication.class, args);
    }

}

@RestController
class DemoImageController {

    @Value("${hello}")
    private String hello;

    @GetMapping
    public String hello() {
        return hello;
    }
}

