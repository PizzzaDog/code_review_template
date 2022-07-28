package org.example.repository;

import org.example.model.Developer;
import java.util.List;

//@Repository
//@Component
public class DeveloperRepository {

    public Developer findById(Integer id) {
        //Going to DB and return Developer
        return new Developer();
    }

    public List<Developer> findAll() {
        //Going to DB and return all Developers
        return null;
    }
}
