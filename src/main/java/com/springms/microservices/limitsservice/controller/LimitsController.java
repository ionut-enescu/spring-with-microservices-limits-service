package com.springms.microservices.limitsservice.controller;

import com.springms.microservices.limitsservice.bean.Limits;
import com.springms.microservices.limitsservice.configuration.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private LimitsConfiguration config;

    @GetMapping("/limits")
    public Limits getLimits() {
//        return new Limits(1, 100);
        return new Limits(config.getMin(), config.getMax());
    }
}
