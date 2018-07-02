/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.config;

import com.mycompany.model.Funcionality;
import com.mycompany.model.Role;
import com.mycompany.model.RoleStatus;
import com.mycompany.model.User;
import com.mycompany.repository.FuncionalityRepository;
import com.mycompany.repository.RoleRepository;
import com.mycompany.repository.UserRepository;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

/**
 *
 * @author kuuhaku
 */
@Component
public class Initializer implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private RoleRepository roleRepo;
    @Autowired
    private FuncionalityRepository funcRepo;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent e) {
        Funcionality func = new Funcionality();
        func.setDescription("Management.");
        funcRepo.save(func);
        for (int i = 0; i < 2; i++) {
            Role role = new Role();
            role.setName("ADM" + i);
            role.setFuncionalities(Arrays.asList(func));
            role.setStatus(RoleStatus.ATIVO);
//            role.setId(UUID.randomUUID().hashCode());
            roleRepo.save(role);
        }
        PageRequest pageReq = PageRequest.of(2, 10);
        Page<Role> roles = roleRepo.findAll(pageReq);
        for (Role role : roles) {
            System.out.println(role);
        }
//        User user = new User();
//        user.setNickname("Kintaro");
//        user.setEmail("golden_boy@gmail.com");
//        user.setRole(role);
//        roleRepo.save(role);
//        userRepo.save(user);
//
//        List<User> result = userRepo.getByRoleStatus(RoleStatus.ATIVO);
//        System.out.println("printing result: \n" + result);
    }
}
