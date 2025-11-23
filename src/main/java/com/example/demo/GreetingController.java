package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping("/hi")
    public String sayHi() {
        return "Hi";
    }
	
	@GetMapping("/message")
	public Integer sumOff(){
		int a = 2;
		int b = 4;
		int sum = a+b;
		return sum;
	}

    @GetMapping("/learn")
    public String leran(){
        return "Learning to ci cd work flow";
    }

//    echo "# demo-cicd-actions" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/mahesh1217/demo-cicd-actions.git
//    git push -u origin main

}
