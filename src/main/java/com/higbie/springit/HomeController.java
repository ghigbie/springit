package com.higbie.springit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Yo baby!";
    }

    @GetMapping("/drones")
    public String drones(){
        return "Drones are here in droves!";
    }
}


