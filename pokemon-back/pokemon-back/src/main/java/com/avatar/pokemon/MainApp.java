package com.avatar.pokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.avatar.pokemon.model"})
public class MainApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(MainApp.class, args);
    }
}
