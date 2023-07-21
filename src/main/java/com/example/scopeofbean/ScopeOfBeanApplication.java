package com.example.scopeofbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeOfBeanApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScopeOfBeanApplication.class, args);
	}

	@Autowired
	ApplicationContext con;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello");
		EmpScope e1 = con.getBean(EmpScope.class);
		e1.setName("kumar");
		EmpScope e2 = con.getBean(EmpScope.class);
		EmpScope e3 = con.getBean(EmpScope.class);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
