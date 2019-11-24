package com.jedzonkoserver.repository;

import com.jedzonkoserver.entity.DishEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<DishEntity, String> {
  List<DishEntity> findAll();


}
