package com.jedzonkoserver.repository;

import com.jedzonkoserver.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, String> {
  List<RestaurantEntity> findAll();

  Optional<RestaurantEntity> findAllByProvince(String province);
}
