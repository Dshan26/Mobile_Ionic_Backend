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
@Table(name = "employees")
@Getter @Setter
@ToString
@EqualsAndHashCode
public class Employee {
  @jakarta.persistence.Id
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String firstname;
  private String lastname;
  private String email;
  private String phone;
  private String address;
  private Double salary;

}
