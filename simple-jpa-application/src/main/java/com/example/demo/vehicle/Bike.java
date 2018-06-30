/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.vehicle;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author kuuhaku
 */
@Component
@Qualifier("bikeBean")
public class Bike implements Vehicle{

    @Override
    public void start() {
        System.out.println("Starting bike.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping bike.");
    }
}
