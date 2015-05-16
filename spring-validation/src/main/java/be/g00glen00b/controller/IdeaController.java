package be.g00glen00b.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import be.g00glen00b.model.Idea;
import be.g00glen00b.repository.IdeaRepository;

@RestController
@RequestMapping("/api/ideas")
public class IdeaController {
  @Autowired
  private IdeaRepository repository;

  @RequestMapping(method = RequestMethod.GET)
  public List<Idea> findAll() {
    return repository.findAll();
  }
  
  @RequestMapping(method = RequestMethod.POST)
  public Idea add(@Validated @RequestBody Idea idea) {
    Idea model = new Idea();
    model.setCreatedAt(new Date());
    model.setTitle(idea.getTitle());
    model.setDescription(idea.getDescription());
    return repository.saveAndFlush(model);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Idea findOne(@PathVariable long id) {
    return repository.findOne(id);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public Idea update(@PathVariable long id, @Validated @RequestBody Idea idea) {
    Idea model = repository.findOne(id);
    if (model != null) {
      model.setTitle(idea.getTitle());
      model.setDescription(idea.getDescription());
      return repository.saveAndFlush(model);
    }
    return null;
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void delete(@PathVariable long id) {
    repository.delete(id);
  }
}
