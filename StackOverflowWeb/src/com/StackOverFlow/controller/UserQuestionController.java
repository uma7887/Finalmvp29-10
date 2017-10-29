
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
import com.StackOverFlow.service.UserQuestionService;
import com.StackOverFlow.service.UserQuestionServiceImpl;


import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

@Path("/question")
public class UserQuestionController {
	
		UserQuestionService userquestionservice = new UserQuestionServiceImpl();

		@Path("/getAllQuestion")
		@GET
		@Produces("application/json")
		public List<UserQuestion> getAllLoginDetail()
		{
			return userquestionservice.getUserQuestion();
		}
		
		@Path("/addquestion")
		@GET
		@Produces("application/json")
		public String addUser(
				@QueryParam("Question") String Question,
				@QueryParam("QuestionLike") long QuestionLike,
				@QueryParam("QuestionTechnology") String QuestionTechnology,
				@QueryParam("QuestionTime") long QuestionTime
				
				)
		{
			
			UserQuestion adduserquestion = new UserQuestion();
				LoginUserDetail loginUserDetail = new LoginUserDetail();
				loginUserDetail.setUserID(1);
				loginUserDetail.setIsActive(1);
				loginUserDetail.setUserEmailAddress("hema.5@gmail.com");
				loginUserDetail.setUserPassword("hemahema");
				loginUserDetail.setUserName("hema");
				adduserquestion.setQuestion("ftwderklhfyiehprwgl");
				adduserquestion.setQuestionLike(12);
				adduserquestion.setQuestionTechnology("jwfgtiuwe");
				adduserquestion.setQuestionTime(Calendar.getInstance(TimeZone.getTimeZone("UTC")));
				adduserquestion.setLoginUserDetail(loginUserDetail);
				return userquestionservice.setUserQuestion(adduserquestion);
			
		}
		
		@Path("/deletequestion")
		@GET
		//@POST
		//@Consumes(MediaType.APPLICATION_JSON)
		@Produces("application/json")
		public String deletequestion(
				@QueryParam("QuestionId") long QuestionId)
		{
			
			UserQuestion deleteuserquestion = new UserQuestion();
			deleteuserquestion.setQuestionID(7);
			return userquestionservice.deleteuserquestion(deleteuserquestion);
			
		}
		
		
		
	}


