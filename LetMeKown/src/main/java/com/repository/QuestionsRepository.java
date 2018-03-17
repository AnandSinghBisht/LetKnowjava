package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.models.Questions;

@Component
public interface QuestionsRepository extends MongoRepository<Questions, String> {

		
}
