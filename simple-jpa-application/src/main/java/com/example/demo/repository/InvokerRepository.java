/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.model.Invoker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author kuuhaku
 */
public interface InvokerRepository extends JpaRepository<Invoker, Integer>{
    Invoker findByNickname(String nickname);
    @Query("SELECT i FROM Invoker i WHERE i.password LIKE %?1%")
    Invoker findByPassLike(String password);
}
