package com.StackOverFlow.service;

import java.util.List;

import com.StackOverFlow.model.UserQuestion;

public interface UserQuestionService {
	
	public List<UserQuestion> getUserQuestion();
	public String setUserQuestion(UserQuestion user);
	public String deleteuserquestion(UserQuestion deleteuserquestion);

}
