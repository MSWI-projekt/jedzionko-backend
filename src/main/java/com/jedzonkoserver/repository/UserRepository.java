package com.jedzonkoserver.repository;

import com.jedzonkoserver.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

  UserEntity findByEmailAndPassword(String email, String password);

  UserEntity findByEmail(String email);
}
