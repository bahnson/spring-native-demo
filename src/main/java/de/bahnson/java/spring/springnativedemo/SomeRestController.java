package de.bahnson.java.spring.springnativedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeRestController {
    @GetMapping("hello")
    String hello() {
        return "Hello Spring Native!";
    }
}
