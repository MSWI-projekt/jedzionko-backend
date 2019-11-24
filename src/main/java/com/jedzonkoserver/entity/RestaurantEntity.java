package com.jedzonkoserver.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "t_restaurant")
public class RestaurantEntity {

  @Id
  @GeneratedValue
  @Column(name = "id")
  private String id;

  @NotNull
  @Column(name = "name", nullable = false)
  private String name;

  @NotNull
  @Column(name = "city", nullable = false)
  private String city;

  @NotNull
  @Column(name = "street", nullable = false)
  private String street;

  @NotNull
  @Column(name = "house_flat_number", nullable = false)
  private String houseFlatNumber;

  @NotNull
  @Column(name = "postal_code", nullable = false)
  private String postalCode;

  @NotNull
  @Column(name = "phone_number", nullable = false)
  private String phoneNumber;

  @NotNull
  @Column(name = "province", nullable = false)
  private String province;

  @OneToMany(fetch = FetchType.EAGER)
  @JoinColumn(name = "dishs")
  private List<DishEntity> dishs;

}
