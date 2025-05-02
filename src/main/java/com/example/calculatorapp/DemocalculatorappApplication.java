package com.example.calculatorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemocalculatorappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemocalculatorappApplication.class, args);
	}

    public int add(int i, int j) {
    
        return i + j;
    }

    public int division(int i, int j) {
      
       return i / j;
    }

    public boolean isEven(int i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    

}
