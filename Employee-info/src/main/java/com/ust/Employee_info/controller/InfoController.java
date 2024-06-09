package com.ust.Employee_info.controller;

import com.ust.Employee_info.model.Employee_info;
import com.ust.Employee_info.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee_info")
public class InfoController {
    @Autowired
    private InfoService infoService;


    @PostMapping("/addInfo")
    public Employee_info addInfo (@RequestBody Employee_info employee_info) {
        return infoService.addInfo(employee_info);
    }



}
