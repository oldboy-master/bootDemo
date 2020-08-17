package com.example.demo.controller;

import com.example.demo.service.RightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rights")
public class RightsController {

    @Autowired
    private RightsService rightsService;

    @RequestMapping("getAllRights")
    public Object getAllRights(int page, int size, String likeName) {
        return rightsService.getAllRights(page, size, likeName);
    }
}
