	package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.QuestionImages;
import com.repository.QuestionImagesRepository;

@Service
public class QuestionImagesService {
	
	@Autowired
	private QuestionImagesRepository questionImageRepo;
	
	public List<QuestionImages> getAllQuestions(){
		
		return questionImageRepo.findAll();
	}
	
	
	

	public void save(QuestionImages image) {
		questionImageRepo.save(image);
		
	}
	
}
