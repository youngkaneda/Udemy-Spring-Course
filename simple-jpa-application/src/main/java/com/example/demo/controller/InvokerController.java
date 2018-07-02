/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.Invoker;
import com.example.demo.service.InvokerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kuuhaku
 */
//@RestController
@Controller
public class InvokerController {
    
    private final InvokerService invokerService;

    @Autowired
    public InvokerController(InvokerService invokerService) {
        this.invokerService = invokerService;
    }
    
//    @GetMapping("/invokers")
//    public List<Invoker> getInvokers() {
//        return invokerService.findAll();
//    }
//    
//    @GetMapping("/invokers/{nickname}")
//    public Invoker getInvoker(@PathVariable String nickname) {
//        for(Invoker inv : invokerService.findAll())
//            if(inv.getNickname().equals(nickname))
//                return inv;
//        return null;
//    }
//    
//    @PostMapping("/newInvoker")
//    public Invoker newInvoker(@RequestBody Invoker invoker) {
//        return invoker;
//    }
    
    @GetMapping("/invoker")
    public String getInvoker(Model model) {
        model.addAttribute("invoker", new Invoker());
        return "invoker";
    }
    
    @PostMapping("/invoker")
    public String newInvoker(@ModelAttribute Invoker invoker) {
        //save the new invoker;
        return "result";
    }
    
    public void hello() {
        System.out.println("entering in hello world");
    }
}
