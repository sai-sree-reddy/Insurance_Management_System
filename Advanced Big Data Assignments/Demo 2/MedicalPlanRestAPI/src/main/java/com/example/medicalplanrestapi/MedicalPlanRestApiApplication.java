package com.example.medicalplanrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.medicalplanrestapi.utils.JsonUtils;

@SpringBootApplication
public class MedicalPlanRestApiApplication {

	public static void main(String[] args) {
//        JsonUtils.loadSchema();

		SpringApplication.run(MedicalPlanRestApiApplication.class, args);
	}

}
