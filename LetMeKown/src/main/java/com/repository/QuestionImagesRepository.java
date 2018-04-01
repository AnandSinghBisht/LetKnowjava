package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.models.QuestionImages;

public interface QuestionImagesRepository extends MongoRepository<QuestionImages, String>{

}
