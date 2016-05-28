package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Autowired
	ServiceImpl serviceImpl;

	@RequestMapping("add")
	public String add()
	{
		serviceImpl.add();
		return "Success";
	}
}
