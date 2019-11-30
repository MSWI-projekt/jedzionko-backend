package com.jedzonkoserver.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "t_users")
public class UserEntity {

  @Id
  @GeneratedValue(generator="system-uuid")
  @GenericGenerator(name="system-uuid", strategy = "uuid")
  @Column(name = "id")
  private String id;

  @NotNull
  @Column(name = "email", unique = true)
  private String email;

  @NotNull
  @Column(name = "password", nullable = false)
  private String password;

  @NotNull
  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "surname")
  private String surname;

  @NotNull
  @Column(name = "user_role", nullable = false)
  private String userRole;

  @Column(name = "city")
  private String city;

  @Column(name = "street")
  private String street;

  @Column(name = "house_flat_number")
  private String houseFlatNumber;

  @Column(name = "postal_code")
  private String postalCode;

  @Column(name = "phone_number")
  private String phoneNumber;

  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "restaurant_id")
  private RestaurantEntity restaurant_id;

  //For admin
  public UserEntity(String id, String email, String password, String name, String userRole) {
    this.id = id;
    this.email = email;
    this.password = password;
    this.name = name;
    this.userRole = userRole;
  }

  //For customer
  public UserEntity(String email, String password, String name, String surname, String userRole, String city, String street, String houseFlatNumber, String postalCode, String phoneNumber) {
    this.email = email;
    this.password = password;
    this.name = name;
    this.surname = surname;
    this.userRole = userRole;
    this.city = city;
    this.street = street;
    this.houseFlatNumber = houseFlatNumber;
    this.postalCode = postalCode;
    this.phoneNumber = phoneNumber;
  }

  //For restaurant
  public UserEntity(String email, String password, String name, String userRole, RestaurantEntity restaurant) {
    this.email = email;
    this.password = password;
    this.name = name;
    this.userRole = userRole;
    this.restaurant_id = restaurant;
  }
}
