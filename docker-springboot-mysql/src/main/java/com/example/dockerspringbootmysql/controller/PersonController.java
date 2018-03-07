package com.example.dockerspringbootmysql.controller;

import com.example.dockerspringbootmysql.dao.Person;
import com.example.dockerspringbootmysql.dao.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonRepo personRepo;


    @GetMapping("/all")
    @ResponseBody
    List<Person> getAll(){
        return personRepo.findAll();
    }

    @PostMapping("/save")
    @ResponseBody
    void savePerson(@RequestBody PersonResource person){
        Person personE = new Person(person.getName(),person.getFamilyName());
        personRepo.save(personE);
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
