/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author kuuhaku
 */
//@Entity
@Document
public class Invoker implements Serializable {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;
    private String id;
    private String nickname;
    private String password;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public void setId(int id) {
//        this.id = id;
//    }
//    
//    public int getId() {
//        return id;
//    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Invoker{" + "id=" + id + ", nickname=" + nickname + ", password=" + password + '}';
    }
}
