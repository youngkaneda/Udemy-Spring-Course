/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author kuuhaku
 */
@Component(value = "vComp")
public class VehicleComponent {
    
    @Autowired
    @Qualifier("bikeBean")
    private Vehicle vehicle;
    
    public void service() {
        vehicle.start();
        vehicle.stop();
    }
}
