package com.jedzonkoserver.service;

import com.jedzonkoserver.DTO.UserDTO;
import com.jedzonkoserver.entity.UserEntity;
import com.jedzonkoserver.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserSevice {
  private final UserRepository userRepository;

  public UserEntity loginUser(UserDTO userDTO) {
    return userRepository.findByEmailAndPassword(userDTO.getEmail(), userDTO.getPassword());
  }

  public void addNew(UserEntity userEntity) {
    userRepository.save(userEntity);
  }
}
