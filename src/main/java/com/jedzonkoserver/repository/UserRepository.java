package com.jedzonkoserver.repository;

import com.jedzonkoserver.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
  List<UserEntity> findAll();

  Optional<UserEntity> findById(String id);

  Optional<UserEntity> findByEmail(String email);
}
