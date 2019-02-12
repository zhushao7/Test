package com.dazhi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dazhi.dao.IDaoService;
import com.dazhi.model.Person;

@RestController
public class HelloController {
	
	private final Logger logger = LoggerFactory.getLogger(HelloController.class); 
	
	@Autowired
	private IDaoService dao;
	
	
	public String list(){
		return dao.findOne("11").getCupSize();
	}
}
