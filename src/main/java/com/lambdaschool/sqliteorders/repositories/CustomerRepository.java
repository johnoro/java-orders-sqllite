package com.lambdaschool.sqliteorders.repositories;

import com.lambdaschool.sqliteorders.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {}
