package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@Slf4j
@RestController
@RequestMapping
public class UserController {

    @GetMapping("/account/{userName}")
    public String getUserAccount(@PathVariable("userName") String userName) {
        log.info("Getting UserAccount by userName: [{}]", userName);
        return "Hello world! :) - :)" + userName;
    }
}
