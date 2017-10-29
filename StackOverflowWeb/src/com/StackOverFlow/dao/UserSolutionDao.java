package com.StackOverFlow.dao;

import java.util.List;
import com.StackOverFlow.model.UserSolution;

public interface UserSolutionDao {
	
	public List<UserSolution> getUserSolution();
	public String addUserSolution(UserSolution addusersolution);
	public String deleteUserSolution(UserSolution deletesolution);
	public String editusersolution(UserSolution editusersolution);

}
