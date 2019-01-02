package com.itcast.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class controller {
	@RequestMapping("/one")
	public String first() {
		System.out.println(11111111);
		return "success";
	}
}
