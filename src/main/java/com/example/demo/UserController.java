package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public String cdFlow(){
        return "ci/cd flow";
    }
}
