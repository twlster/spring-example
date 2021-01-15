package com.example.multimodule.rest;
import java.util.Random;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.Person;
import com.example.api.rest.PersonApi;

@RestController
public class PersonApiImpl implements PersonApi {

	@Override
	public ResponseEntity<Person> getPerson() {
		Person person = new Person();
		person.setId(new Random().nextLong());
		person.setFirstName(generateRandomString());
		person.setLastName(generateRandomString());
		person.setEmail(generateEmail());
		person.setEmail1(generateEmail());
		person.setAge(new Random().nextInt());
		person.setCreditCard(generateRandomString());
		return ResponseEntity.ok(person);
	}
	
	@Override
	public ResponseEntity<Person> postPerson(Person person) {
		return ResponseEntity.ok(person);
	}
	

	private String generateRandomString() {
		return String.valueOf(new Random().nextLong());
	}

	private String generateEmail() {
		StringBuffer email = new StringBuffer();
		email.append(String.valueOf(new Random().nextLong()));
		email.append("@");
		email.append(String.valueOf(new Random().nextLong()));
		return email.toString();
	}

}