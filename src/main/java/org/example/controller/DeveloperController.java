package org.example.controller;

import org.example.model.Developer;
import org.example.service.DeveloperService;

import java.util.List;

//@RestController
public class DeveloperController {


    //@GetMapping("/user/{id})
    public Developer getDevelopers(Integer id) {
        DeveloperService service = new DeveloperService();
        Developer developer;
        List<Developer> all = service.getAll();
        developer = all.stream()
                            .map(x -> x.getId() == id ? x : new Developer())
                            .findFirst()
                            .get();
        return developer;
    }

    //@GetMapping("/users)
    public List<Developer> getAllDevelopers() {
        DeveloperService service = new DeveloperService();
        return service.getAll();
    }
}
