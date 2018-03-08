package com.example.dockerspringbootmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = "com.example.dockerspringbootmysql")
public class DockerSpringbootMysqlApplication{

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringbootMysqlApplication.class, args);
	}

}
