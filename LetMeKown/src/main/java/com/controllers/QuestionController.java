package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.models.Questions;
import com.repository.QuestionsRepository;
import com.service.QuestionsService;		

@RestController
public class QuestionController {
	
	/*@Autowired
	private QuestionsService questionService;
	*/
	@Autowired
	private QuestionsRepository questionRepository;
	
	@RequestMapping(value="/allQuestoins")
	public List<Questions> getAllQuestion()
	{
		
		return questionRepository.findAll();
			
	
	}
	@RequestMapping(value="/save" ,method=RequestMethod.POST)
	public void addQuestion(@RequestBody Questions question)
	{
		questionRepository.save(question);
	}
	

}
