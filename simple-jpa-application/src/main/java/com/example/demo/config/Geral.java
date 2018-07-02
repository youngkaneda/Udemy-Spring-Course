/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 *
 * @author kuuhaku
 */
@Component
public class Geral implements ApplicationListener<ContextRefreshedEvent>{

    @Value("${geral.nome}")
    private String nome;
    
    @Override
    public void onApplicationEvent(ContextRefreshedEvent e) {
        System.out.println("printing geral.nome prop: " + nome);
    }
    
}
