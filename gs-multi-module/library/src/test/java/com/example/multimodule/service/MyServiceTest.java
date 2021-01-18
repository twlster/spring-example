package com.example.multimodule.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest("service.message=Hello")
public class MyServiceTest {

	@Autowired
	private MyService myService;

	@Test
	public void contextLoads() {
		// assertThat(myService.message()).isNotNull();
		Persona persona = new Persona();
		persona.setFecha(LocalDate.now().minusYears(5));
		assertEquals(persona.getAge(), Long.valueOf(5));
	}

	@SpringBootApplication
	static class TestConfiguration {
	}

}