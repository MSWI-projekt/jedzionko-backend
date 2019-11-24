package com.jedzonkoserver.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "t_dish")
public class DishEntity {

  @Id
  @GeneratedValue
  @Column(name = "id")
  private String id;

  @NotNull
  @Column(name = "name", nullable = false)
  private String name;

  @NotNull
  @Column(name = "price", nullable = false)
  private String price;
}
