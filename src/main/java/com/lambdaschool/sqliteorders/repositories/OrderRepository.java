package com.lambdaschool.sqliteorders.repositories;

import com.lambdaschool.sqliteorders.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {}
