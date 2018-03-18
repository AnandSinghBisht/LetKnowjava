	package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Questions;
import com.repository.QuestionsRepository;

@Service
public class QuestionsService {
	
	@Autowired
	private QuestionsRepository questionRepo;
	
	/*public List<Questions> getAllQuestions(){
		
		return questionRepo.findAll();
	}
	*/
	
	public void addQuestion()
	{
		Questions q=new Questions();
		q.setContent("hello");
		questionRepo.save(q);
	}
	
}
