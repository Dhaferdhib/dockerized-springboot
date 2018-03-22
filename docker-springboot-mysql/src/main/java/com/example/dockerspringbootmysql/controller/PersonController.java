package com.example.dockerspringbootmysql.controller;

import com.example.dockerspringbootmysql.dao.Person;
import com.example.dockerspringbootmysql.dao.PersonRepo;
import com.example.dockerspringbootmysql.exceptions.InvalidPathException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    PersonRepo personRepo;

    @GetMapping("/alla")
    @ResponseBody
    List<Person> getAll(){
        LOGGER.info("[PersonController] getAll");
        return personRepo.findAll();
    }

    @PostMapping("/save")
    @ResponseBody
    void savePerson(@RequestBody PersonResource person){
        LOGGER.info("[PersonController] save");
        Person personE = new Person(person.getName(),person.getFamilyName());
        personRepo.save(personE);
    }

    @GetMapping("/delete")
    @ResponseBody
    void removePerson(@RequestParam Long id){
        LOGGER.info("[PersonController] removePerson");
        personRepo.deleteById(id);
    }

}

class PersonResource{
    String name;
    String familyName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
