package com.example.dockerspringbootmysql;

import com.example.dockerspringbootmysql.dao.Person;
import com.example.dockerspringbootmysql.dao.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = "com.example.dockerspringbootmysql")
public class DockerSpringbootMysqlApplication implements CommandLineRunner{
	@Autowired
	PersonRepo personRepo;

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootMysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Dhafer","Dhib"));
		list.add(new Person("Mongi","Dhib"));
		personRepo.saveAll(list);
	}
}
