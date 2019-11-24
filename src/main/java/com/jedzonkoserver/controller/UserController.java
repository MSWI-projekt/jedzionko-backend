package com.jedzonkoserver.controller;

import com.jedzonkoserver.entity.UserEntity;
import com.jedzonkoserver.repository.UserRepository;
import com.jedzonkoserver.service.UserSevice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/login")
public class UserController {

  private UserSevice userSevice;
  private UserRepository userRepository;

  @GetMapping("/data")
  public Optional<UserEntity> getUserByEmail(String email){
    return userRepository.findByEmail(email);
  }
}
