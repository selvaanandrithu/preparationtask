package com.example.scopeofbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component
public class EmpScope {

	private String name;

	public String getName() {
		return name;
	}

	@Value("Nisha")
	public void setName(String name) {
		this.name = name;
	}

	public EmpScope() {
		System.out.println("Bean is created");
	}

	@Override
	public String toString() {
		return "EmpScope [name=" + name + "]";
	}

}
