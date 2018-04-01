	package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Question;
import com.repository.QuestionsRepository;

@Service
public class QuestionsService {
	
	@Autowired
	private QuestionsRepository questionRepo;
	
	public List<Question> getAllQuestions(){
		
		return questionRepo.findAll();
	}
	
	
	public void addQuestion()
	{
		Question q=new Question();
		q.setContent("hello");
		questionRepo.save(q);
	}


	public List<Question> findAll() {
		return questionRepo.findAll();
	}


	public void save(Question question) {
		questionRepo.save(question);
		
	}


	
}
