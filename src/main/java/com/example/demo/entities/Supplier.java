package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "suppliers")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Supplier {
  @jakarta.persistence.Id
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String email;
  private String phone;
  private String address;
  private String web;
  private String contact;

}
