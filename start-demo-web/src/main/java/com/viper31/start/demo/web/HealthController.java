package com.viper31.start.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Viper31
 */
@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public String health() {
        return "Try-Mall-Admin is running";
    }

}
