package com.jedzonkoserver.controller;

import com.jedzonkoserver.DTO.UserDTO;
import com.jedzonkoserver.entity.UserEntity;
import com.jedzonkoserver.repository.UserRepository;
import com.jedzonkoserver.service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class UserController {

  @Autowired
  private UserSevice userSevice;

  @PostMapping(value = "/data", consumes = MediaType.APPLICATION_JSON_VALUE)
  public UserEntity getUserByEmail(@RequestBody UserDTO userDTO) {
    return userSevice.loginUser(userDTO);
  }

  @PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE)
  public void registerCustomer(@RequestBody UserEntity userEntity) {
    userSevice.addNew(userEntity);
  }
}
