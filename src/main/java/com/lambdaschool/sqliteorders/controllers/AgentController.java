package com.lambdaschool.sqliteorders.controllers;

import com.lambdaschool.sqliteorders.models.Agent;
import com.lambdaschool.sqliteorders.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "agents", produces = MediaType.APPLICATION_JSON_VALUE)
public class AgentController {
  @Autowired
  AgentRepository repository;

  @GetMapping("")
  public List<Agent> all() {
    return repository.findAll();
  }
}
