/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repository;

import com.mycompany.model.Funcionality;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kuuhaku
 */
public interface FuncionalityRepository extends JpaRepository<Funcionality, Integer>{
    
}
