package dev.entringer.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("properties")
public class Properties {

    @Value("${app.owner}")
    private String owner;

    @GetMapping("/list")
    public String listProperties() {

        return owner;
    }
}
