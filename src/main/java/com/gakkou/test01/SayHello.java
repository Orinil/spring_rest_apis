package com.gakkou.test01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {

    @RequestMapping("/sayhello")
    public String sayHello(){
        return "Hello world";
    }

    @RequestMapping("/saybye")
    public String sayBye(){
        return "Bye world";
    }
}
