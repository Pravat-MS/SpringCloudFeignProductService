package com.pravat.ms.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="BRAND-SERVICE")
public interface IBrandRestConsumer {
    
	@GetMapping("/brand/msg")
	public String getMsg();
	
	@GetMapping("/brand/getBrandData")
	public String getBrandData();
	
	
	
}
