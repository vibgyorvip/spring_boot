package com.programming.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyfirstprojApplication {

	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(MyfirstprojApplication.class, args);
		
		//Alien obj = new Alien(); // we don't want to create object by self ,want to inject object
		// now you are not resposible to create the object.
		Alien obj = context.getBean(Alien.class); 
		obj.code();
		
	}

}
