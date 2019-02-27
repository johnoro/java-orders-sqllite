package com.lambdaschool.sqliteorders.controllers;

import com.lambdaschool.sqliteorders.models.Agent;
import com.lambdaschool.sqliteorders.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("{id}")
  public Agent oneById(@PathVariable Long id) {
    var found = repository.findById(id);
    if (found.isPresent()) {
      return found.get();
    }
    return null;
  }

  @PostMapping("")
  public Agent add(@RequestBody Agent agent) {
    return repository.save(agent);
  }
}
