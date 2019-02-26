package com.lambdaschool.sqliteorders.repositories;

import com.lambdaschool.sqliteorders.models.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent, Long> {}
