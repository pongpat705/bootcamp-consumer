package com.example.consumer.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HealthCheckRestController {
    @GetMapping("/consumer/health/check")
    public HashMap<String, Object> health(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("code", 0);
        result.put("message", "OK");
        return result;
    }
}
