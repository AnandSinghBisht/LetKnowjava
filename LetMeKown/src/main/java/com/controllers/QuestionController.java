package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.models.Questions;
import com.repository.QuestionsRepository;		

@RestController
public class QuestionController {
	
	@Autowired
	private QuestionsRepository questionRepo;
	
	@RequestMapping(value="/allQuestoins")
	public List<Questions> getAllQuestion()
	{
		
		System.out.println("sdfkj");
		
		return null;
			
	
	}
	

}
