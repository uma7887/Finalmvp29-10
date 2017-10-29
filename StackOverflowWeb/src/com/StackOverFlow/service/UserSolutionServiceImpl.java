package com.StackOverFlow.service;

import java.util.List;

import com.StackOverFlow.dao.UserSolutionDao;
import com.StackOverFlow.dao.UserSolutionDaoImpl;
import com.StackOverFlow.model.UserSolution;

public class UserSolutionServiceImpl implements UserSolutionService  {

	UserSolutionDao usersolutiondao = new UserSolutionDaoImpl();  
	@Override
	public List<UserSolution> getUserSolution() {
		return usersolutiondao.getUserSolution();
	}

	@Override
	public String addUserSolution(UserSolution addusersolution) {
		return usersolutiondao.addUserSolution(addusersolution);
	}

	@Override
	public String editserSolution(UserSolution editusersolution) {
		return usersolutiondao.editusersolution(editusersolution);
	}

	@Override
	public String deleteUserSolution(UserSolution deleteusersolution) {
		return usersolutiondao.deleteUserSolution(deleteusersolution);
	}

}
