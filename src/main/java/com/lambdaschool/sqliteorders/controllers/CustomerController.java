package com.lambdaschool.sqliteorders.controllers;

import com.lambdaschool.sqliteorders.models.Customer;
import com.lambdaschool.sqliteorders.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "customers", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {
  @Autowired
  CustomerRepository repository;

  @GetMapping("")
  public List<Customer> all() {
    return repository.findAll();
  }
}
