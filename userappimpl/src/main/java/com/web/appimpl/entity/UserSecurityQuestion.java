package com.web.appimpl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_securityquestion",schema="user_authentication")
public class UserSecurityQuestion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="u_sq_pk")
	private int u_SqPk;
	
	@Column(name="u_registartion_fk",nullable=false)
	private int uRegistartionFk;
	
	@Column(name="u_questionNo")
	private int questionNo;
	
	@Column(name="u_securityQuestion")
	private String securityQuestion;
	
	@Column(name="u_answer")
	private String answer;

	public UserSecurityQuestion() {
		super();
	}

	public int getU_SqPk() {
		return u_SqPk;
	}

	public void setU_SqPk(int u_SqPk) {
		this.u_SqPk = u_SqPk;
	}

	public int getuRegistartionFk() {
		return uRegistartionFk;
	}

	public void setuRegistartionFk(int uRegistartionFk) {
		this.uRegistartionFk = uRegistartionFk;
	}

	public int getQuestionNo() {
		return questionNo;
	}

	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	

}
