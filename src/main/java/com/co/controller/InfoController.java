package com.co.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.co.dominio.stream.Stream;

@RestController
public class InfoController {
	
	private Stream stream;
	
	
	@Autowired
	public InfoController(Stream stream) {
		super();
		this.stream = stream;
	}



	@RequestMapping("/")
	public @ResponseBody String userInfo() {
		stream.primerEjemplo();
		return "LLego";
	}
}	 
