package com.lambdaschool.sqliteorders.repositories;

import com.lambdaschool.sqliteorders.models.Customer;

public interface CustomerRepository extends Repository<Customer> {
  Customer findByName(String name);
}
