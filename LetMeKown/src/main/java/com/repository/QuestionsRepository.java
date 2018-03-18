package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.models.Questions;

public interface QuestionsRepository extends MongoRepository<Questions, String>{
	
}
