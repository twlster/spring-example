package com.example.multimodule.rest;

import com.example.api.rest.DefaultApi;
import com.example.multimodule.service.MyService;
import com.fasterxml.jackson.core.JsonParser;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultApiImpl implements DefaultApi {

	private final MyService myService;

	public DefaultApiImpl(MyService myService) {
		this.myService = myService;
	}

	@Override
	public ResponseEntity<String> getGenericMessage() {
		return ResponseEntity.ok(new JSONObject("{\"message\":\"" + myService.message() + "\"}").toString());

	}
}