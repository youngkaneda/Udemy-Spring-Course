/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repository;

import com.mycompany.model.RoleStatus;
import com.mycompany.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kuuhaku
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    List<User> getByRoleStatus(RoleStatus status);
}
