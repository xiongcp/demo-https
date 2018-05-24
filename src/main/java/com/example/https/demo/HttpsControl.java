package com.example.https.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpsControl {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "Hello Https!";
    }
}
