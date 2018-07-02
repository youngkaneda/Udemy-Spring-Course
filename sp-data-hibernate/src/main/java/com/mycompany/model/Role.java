/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author kuuhaku
 */
@Entity
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Enumerated(EnumType.STRING)
    private RoleStatus status;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Funcionality> funcionalities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleStatus getStatus() {
        return status;
    }

    public void setStatus(RoleStatus status) {
        this.status = status;
    }

    public List<Funcionality> getFuncionalities() {
        return funcionalities;
    }

    public void setFuncionalities(List<Funcionality> funcionalities) {
        this.funcionalities = funcionalities;
    }

    @Override
    public String toString() {
        return "Role{" + "id=" + id + ", name=" + name + ", status=" + status + ", funcionalities=" + funcionalities + '}';
    }
}
