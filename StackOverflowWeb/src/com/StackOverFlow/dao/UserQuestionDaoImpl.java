package com.StackOverFlow.dao;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;



import com.StackOverFlow.model.LoginUserDetail;
import com.StackOverFlow.model.UserQuestion;
import com.StackOverFlow.service.UserQuestionService;
import com.StackOverFlow.util.HibernateUtil;

public class UserQuestionDaoImpl implements UserQuestionDao {

HibernateUtil hibernateUtil = new HibernateUtil();


	@Override
	public List<UserQuestion> getUserQuestion() {
		hibernateUtil.openCurrentSession();
		
		List<UserQuestion> UserQuestion_records =(List<UserQuestion>)hibernateUtil.getCurrentSession().createQuery("from UserQuestion").list();
		
		hibernateUtil.closeCurrentSession();
		
		return UserQuestion_records;
	}


	@Override
	public String setUserQuestion(UserQuestion user) {
		hibernateUtil.openCurrentSessionwithTransaction();
		long id = (Long)hibernateUtil.getCurrentSession().save(user);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "succes"+id;
	}


	@Override
	public String deleteuserquestion(UserQuestion deleteuserquestion) {
		hibernateUtil.openCurrentSessionwithTransaction();
		hibernateUtil.getCurrentSession().delete(deleteuserquestion);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "delete succes";
	}
	}
	
	/*public  List<UserQuestion> setUserQuestion() {
		hibernateUtil.openCurrentSession();
		UserQuestion department = new UserQuestion();
		department.setQuestion("how does web services work?");
		department.setQuestionLike(1);
		department.setQuestionTechnology("web");
		department.setQuestionTime(Calendar.getInstance(TimeZone.getTimeZone("UTC")));
		List<UserQuestion> questionUser = new ArrayList<UserQuestion>();
		department.getLoginUserDetail(questionUser)a);
		int a=1;
		
		LoginUserDetail account3 = new LoginUserDetail();
		
		questionUser.add(1);
		account3.setQuestionUser(questionUser);
	
		 Set<LoginUserDetail> accountsOfSecondEmployee = new HashSet<LoginUserDetail>();
	        accountsOfSecondEmployee.add(account3);
		
		Integer id = (Integer)hibernateUtil.getCurrentSession().save(department);
		System.out.println("Question svaed with id" +id);
		
		
		hibernateUtil.closeCurrentSessionwithTransaction();
		return null;
		
		
		
	}
 public static void main(String [] args){
	  UserQuestion userQuestion = new UserQuestion();
	  userQuestion.setQuestion("Jioadfg");
	  userQuestion.setQuestionLike(5214);
	  userQuestion.setQuestionTechnology("asdf");
	  userQuestion.setQuestionTime(Calendar.getInstance(TimeZone.getTimeZone("UTC")));
	  List<LoginUserDetail> LoginUserDetail = new ArrayList <LoginUserDetail>();
	  LoginUserDetail.ge
	  userQuestion.getLoginUserDetail();
	  
	  System.out.println();
  }*/

	




