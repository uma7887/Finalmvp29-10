package com.StackOverFlow.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.StackOverFlow.model.LoginUserDetail;
import com.StackOverFlow.model.UserQuestion;
import com.StackOverFlow.model.UserSolution;
import com.StackOverFlow.service.UserQuestionService;
import com.StackOverFlow.service.UserQuestionServiceImpl;
import com.StackOverFlow.service.UserSolutionService;
import com.StackOverFlow.service.UserSolutionServiceImpl;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

@Path("/solution")
public class UserSolutionController {
	
		UserSolutionService usersolutionservice = new UserSolutionServiceImpl();

		@Path("/getAllSolution")
		@GET
		@Produces("application/json")
		public List<UserSolution> getAllLoginDetail()
		{
			return usersolutionservice.getUserSolution();
		}
		
		@Path("/addsolution")
		@GET
		@Produces("application/json")
		public String addUser(
				@QueryParam("Solution") String Solution,
				@QueryParam("SolutionLike") long SolutionLike,
				@QueryParam("SolutionTime") long SolutionTime
				
				)
		{
			
				UserSolution addusersolution = new UserSolution();
				LoginUserDetail loginUserDetail = new LoginUserDetail();
				UserQuestion userquestion = new UserQuestion();
				loginUserDetail.setUserID(1);
				loginUserDetail.setIsActive(1);
				loginUserDetail.setUserEmailAddress("hema.5@gmail.com");
				loginUserDetail.setUserPassword("hemahema");
				loginUserDetail.setUserName("hema");
				
				userquestion.setQuestionID(2);
				userquestion.setQuestion("ftwderklhfyiehprwgl");
				userquestion.setQuestionLike(12);
				userquestion.setQuestionTechnology("jwfgtiuwe");
				userquestion.setQuestionTime(Calendar.getInstance(TimeZone.getTimeZone("UTC")));
				
				addusersolution.setSolution("solution");
				addusersolution.setSolutionLike(10);
				addusersolution.setSolutionTime(Calendar.getInstance(TimeZone.getTimeZone("UTC")));
				addusersolution.setSolutionQuestionIDFK(userquestion);
				addusersolution.setSolutionUserIDFK(loginUserDetail);
				return usersolutionservice.addUserSolution(addusersolution);
			
		}
		
		@Path("/deletesolution")
		@GET
		//@POST
		//@Consumes(MediaType.APPLICATION_JSON)
		@Produces("application/json")
		public String deletesolution(
				@QueryParam("SolutionID") long SolutionId)
		{
			
			UserSolution deleteusersolution = new UserSolution();
			deleteusersolution.setSolutionID(12);
			return usersolutionservice.deleteUserSolution(deleteusersolution);
			
		}
		
		@Path("/editsolution")
		@GET
		//@POST
		//@Consumes(MediaType.APPLICATION_JSON)
		@Produces("application/json")
		public String editsolution(
				@QueryParam("SolutionID") long SolutionID,
				@QueryParam("editedSolution") String editedSolution,
				@QueryParam("editedSolutionLike") long editedSolutionLike,
				@QueryParam("editedSolutionTime") long editedSolutionTime
				)
		{
			
			UserSolution editusersolution = new UserSolution();
			editusersolution.setSolutionID(12);
			editusersolution.setSolution("solution");
			editusersolution.setSolutionLike(10);
			editusersolution.setSolutionTime(Calendar.getInstance(TimeZone.getTimeZone("UTC")));
			return usersolutionservice.addUserSolution(editusersolution);
			
		}
		
		
		
		
}