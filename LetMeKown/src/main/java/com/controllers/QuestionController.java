package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.models.Question;
import com.service.QuestionsService;		

@RestController
public class QuestionController {
	
	@Autowired
	private QuestionsService questionService;
	
	/**
	 * @return All question in database
	 */
	@RequestMapping(value="/allQuestoins")
	public List<Question> getAllQuestion()
	{
		
		return questionService.findAll();
	
	}
	
	
	/**
	 * save an question object to database
	 * @param question
	 */
	@RequestMapping(value="/save" ,method=RequestMethod.POST)
	public void addQuestion(@RequestBody Question question)
	{
		questionService.save(question);
	}
	
	
	/**
	 * just to add some dummy qustion will be removed in future
	 */
	@RequestMapping(value="/savedummy" ,method=RequestMethod.POST)
	public void addQuestions()
	{
		System.out.println("We are here");
		Question q=new Question();
		q.setContent("First QUestion");
		q.setId("Q-1");
		questionService.save(q);
		q.setContent("Second QUestion");
		q.setId("Q-2");
		questionService.save(q);
		q.setContent("Third QUestion");
		q.setId("Q-3");
		questionService.save(q);
	}

}
