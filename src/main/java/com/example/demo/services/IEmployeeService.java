package com.example.demo.services;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Employee;

import java.util.List;

public interface IEmployeeService {
  public List<Employee> getAll();

  Employee getById(Long id);

  void remove(Long id);

  void save(Employee employee);
}
