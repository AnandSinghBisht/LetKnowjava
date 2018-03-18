package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.models.Question;

public interface QuestionsRepository extends MongoRepository<Question, String>{
	
}
