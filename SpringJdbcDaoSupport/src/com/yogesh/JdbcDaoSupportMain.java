package com.yogesh;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDaoSupportMain {

	public static void  main(String arg[]) 
	{
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("/SpringConfig.xml");
		
		System.out.println("Displaying the Perosn Table Data");
		
		PersonService service= (PersonService) ctx.getBean("personService");
		
		List<PersonDTO> list= service.getAllPerson();
		
		for (PersonDTO personDTO : list) {
			
			System.out.println("Person Name is: "+ personDTO.getName()+ " Email is: "+ personDTO.getEmail());
		}
		
	}
	
}
