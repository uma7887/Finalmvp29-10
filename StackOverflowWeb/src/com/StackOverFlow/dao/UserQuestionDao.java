package com.StackOverFlow.dao;

import java.util.List;

import com.StackOverFlow.model.UserQuestion;

public interface UserQuestionDao {

	public List<UserQuestion> getUserQuestion();
	public String setUserQuestion(UserQuestion user);
	public String deleteuserquestion(UserQuestion deleteuserquestion);


}
