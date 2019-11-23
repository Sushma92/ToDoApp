package com.todo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class AppWebMain 
{
    public static void main( String[] args )
    {
    	SpringApplication app = new SpringApplication(AppWebMain.class);
    	app.run(args);
        System.out.println( "Hello World!" );
    }
}
