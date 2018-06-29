/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.model.Invoker;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author kuuhaku
 */
public interface InvokerRepository extends /*JpaRepository<Invoker, Integer>*/ MongoRepository<Invoker, String>{
    //get or find or  works
    Invoker findByNickname(String nickname);
    //@Query("SELECT i FROM Invoker i WHERE i.password LIKE %?1%")
    Invoker getByPasswordLike(String password);
    @Query("{'nickname' : ?0}")
    Invoker getByNickname(String nickname);
    Invoker getByNicknameIgnoreCaseAndPassword(String nickname, String password);
}
