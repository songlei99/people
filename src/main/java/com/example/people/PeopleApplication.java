package com.example.people;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.example.people.model.Employee;
import com.example.people.repository.EmployeeRepository;

@SpringBootApplication
public class PeopleApplication extends SpringBootServletInitializer{

	private static final Logger logger = LoggerFactory.getLogger(PeopleApplication.class);

    private static Class<PeopleApplication> applicationClass = PeopleApplication.class;
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleApplication.class, args);
	}
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(applicationClass);
	    }
	
	@Bean
	public CommandLineRunner setup(EmployeeRepository employeeRepository) {
		return (args) -> {
			employeeRepository.save(new Employee("Gustavo", "Ponce", true));
			employeeRepository.save(new Employee("John", "Smith", true));
			employeeRepository.save(new Employee("Jim ", "Morrison", false));
			employeeRepository.save(new Employee("David", "Gilmour", true));
			employeeRepository.save(new Employee("Jessie", "Tan", true));
			logger.info("The sample data has been generated");
		};
	}
}
