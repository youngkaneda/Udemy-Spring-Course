/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.service.InvokerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author kuuhaku
 */
@Controller
public class InvokerController {
    
    private final InvokerService invokerService;

    @Autowired
    public InvokerController(InvokerService invokerService) {
        this.invokerService = invokerService;
    }
    
    @GetMapping("/invokers")
    public String getInvokers(Model model) {
        model.addAttribute("invokersList", invokerService.findAll());
        return "invokers";
    }
}
