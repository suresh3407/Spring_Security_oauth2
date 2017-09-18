/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypack.demo.controller;


import com.mypack.demo.model.User;
import com.mypack.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sureshghale
 */
@RestController
public class UserController {
     @Autowired
  private UserRepository repo;
  @Transactional
  @PostMapping("/user")
 
  public ResponseEntity<?> save(@RequestBody User user){
      repo.save(user);
      return ResponseEntity.ok("saved");
  }
}
