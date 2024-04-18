package com.example.IocDemo;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IocDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocDemoApplication.class, args);
		String size;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of table");
		size=s.next();
//		Table shortTable=new shortTable();
//		Table longTable=new longTable();
		ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//System.out.println("line 23");
		
		Table shortTable=(Table) con.getBean("shortTable");
		Table longTable=(Table) con.getBean("longTable");
		if(size.equalsIgnoreCase("Long")) {
			System.out.println(longTable.showDetails());
		}
		else {
			System.out.println(shortTable.showDetails());
		}
		
	}

}
