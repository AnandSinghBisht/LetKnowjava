package com.models;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Questions")
public class Question {

	@Id
	private String id;
	private String content;
	private Date createDate = new Date();
	private String modifyDate;
	
	
	private List<QuestionImages> questionImages;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public List<QuestionImages> getQuestionImages() {
		return questionImages;
	}

	public void setQuestionImages(List<QuestionImages> questionImages) {
		this.questionImages = questionImages;
	}
	
	

}
