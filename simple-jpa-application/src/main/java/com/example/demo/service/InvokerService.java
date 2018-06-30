/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.Invoker;
import com.example.demo.repository.InvokerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kuuhaku
 */
@Service
public class InvokerService {
    
    private final InvokerRepository repo;

    @Autowired
    public InvokerService(InvokerRepository repo) {
        this.repo = repo;
    }
    
    public List<Invoker> findAll() {
        //do some business work here.
        return repo.findAll();
    }
}
