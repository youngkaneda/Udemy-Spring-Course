/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author kuuhaku
 */
//@Component
@Configuration
@Profile("dev")
public class DevPortConfig {
    @Bean
    public DevBean devBean() {
        return new DevBean();
    }
}
