package org.example.service;

import org.example.model.*;
import org.example.repository.DeveloperRepository;

import java.util.List;

//@Service
public class DeveloperService {

    //@Autowired
    private DeveloperRepository developerRepository;

    public Developer getById(Integer id) {
        return developerRepository.findById(id);
    }

    public List<Developer> getAll() {
        return developerRepository.findAll();
    }
}
