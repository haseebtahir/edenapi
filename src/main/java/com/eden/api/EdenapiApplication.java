package com.eden.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EdenapiApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(EdenapiApplication.class, args);
		System.out.println("    ______    __              _____ __                ___    ____  ____\n" + 
				"   / ____/___/ /__  ____     / ___// /_____ ______   /   |  / __ \\/  _/\n" + 
				"  / __/ / __  / _ \\/ __ \\    \\__ \\/ __/ __ `/ ___/  / /| | / /_/ // /  \n" + 
				" / /___/ /_/ /  __/ / / /   ___/ / /_/ /_/ / /     / ___ |/ ____// /   \n" + 
				"/_____/\\__,_/\\___/_/ /_/   /____/\\__/\\__,_/_/     /_/  |_/_/   /___/");
		
	}

}
