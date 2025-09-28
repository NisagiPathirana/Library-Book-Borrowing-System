package edu.icet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController         //@Controller @ResponseBody

public class BookController {

    @GetMapping
    public String getAPI(){
        return "API CALLING ";
    }
}
