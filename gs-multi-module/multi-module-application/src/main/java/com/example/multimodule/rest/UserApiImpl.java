package com.example.multimodule.rest;

import java.util.Random;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.User;
import com.example.api.rest.UserApi;

@RestController
public class UserApiImpl implements UserApi {

	@Override
	public ResponseEntity<User> getUserByName(String username) {
		User user = new User();
		user.setId(new Random().nextLong());
		user.setUserStatus(new Random().nextInt());
		user.setFirstName(String.valueOf(new Random().nextLong()));
		user.setUsername(username);
		return ResponseEntity.ok(user);
	}

}