package com.pravat.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pravat.ms.service.IBrandRestConsumer;

@RestController
@RequestMapping("/product")
public class ProductRestController {

	@Autowired
	private IBrandRestConsumer consumer;
	
	@GetMapping("/data")
	public String getData() {
		return "FROM PRODUCT =>" + consumer.getMsg();
	}
	
	
	
	
	
}
