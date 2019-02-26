package com.lambdaschool.sqliteorders.controllers;

import com.lambdaschool.sqliteorders.models.Customer;
import com.lambdaschool.sqliteorders.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("{id}")
  public Customer oneById(@PathVariable Long id) {
    var found = repository.findById(id);
    if (found.isPresent()) {
      return found.get();
    }
    return null;
  }

  @PostMapping("")
  public Customer add(@RequestBody Customer customer) {
    return repository.save(customer);
  }

  @PutMapping("{id}")
  public Customer update(@RequestBody Customer customer, @PathVariable Long id) {
    var found = repository.findById(id);
    if (found.isPresent()) {
      customer.setId(id);
      return repository.save(customer);
    }
    return null;
  }

  @DeleteMapping("{id}")
  public Customer delete(@PathVariable Long id) {
    var found = repository.findById(id);
    if (found.isPresent()) {
      repository.deleteById(id);
      return found.get();
    }
    return null;
  }
}
