/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.config;

import com.example.demo.model.Invoker;
import com.example.demo.repository.InvokerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 *
 * @author kuuhaku
 */
@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>{

    @Autowired
    private InvokerRepository repo;
    
    @Override
    public void onApplicationEvent(ContextRefreshedEvent e) {
        if(!repo.findAll().isEmpty()){
            Invoker invoker = repo.getOne(3);
            invoker.setPassword("Kaneda");
            System.out.println(invoker);
//            repo.deleteById(3);
            repo.save(invoker);
            return;
        }
        Invoker invoker = new Invoker();
        invoker.setNickname("admin");
        invoker.setPassword("admin");
        repo.save(invoker);
    }
}