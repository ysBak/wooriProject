package com.example.Woori.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @GetMapping("/api/event/title")
    public String eventTitle() {
        return "ビジネス交流会";
    }


}