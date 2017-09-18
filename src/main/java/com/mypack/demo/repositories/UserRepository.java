/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypack.demo.repositories;

import com.mypack.demo.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sureshghale
 */
public interface UserRepository  extends JpaRepository<User, Long>{
List<User> findByuserName(String userName);    
}
