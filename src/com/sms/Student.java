package com.sms;

/**
 * this class is used to keep track the students data
 * @author RUSHIKESH name, id , grade , fees
 */
public class Student{
	private int id;
	private String name;
	private int grade;
	private int fees_paid;
	private int fees_total;
	
	/**
	 * creating a student constructor which is called when it is created
	 * @param id  id of student which s unique
	 * @param name name of the student
	 * @param grade grade of student
	 * Initially fees paid=0
	 * total fees is 30000
	 */
	
	Student(int id,String name,int grade) {
		this.id=id;
		this.name=name;
		this.grade=grade;
		fees_paid=0;
		fees_total=3000;
	}
	
	// no need to alter students name
	
	public void setGrade(int grade) {
		this.grade=grade;
		
	}
	
	public void payees(int fees) {
		fees_paid=fees_paid+fees;
		School.UpdateTotalmoneyeearned(fees_paid);
	}
	
	// returns id of the student
	public int getId() {
		return id;
	}
	
	// returns name of the student
	public String getName() {
		return name;
	}
	
	// returns grade of student
	public int getGrade() {
		return grade;
	}
	// returns fees paid by the student
	public int getFeespaid()	{
	return fees_paid;	
	}
	
	// returns total fees to be paid by the studnet
	public int getTotalfees() {
		return fees_total; 
	}
	
	
	public int getremainingfeees(int fees) {
		return  fees_total - fees_paid;
		
	}
	
	
	@Override
	public String toString() {
	
		return "students namee is " +getName() + " feees paid is "+fees_paid;
	}
	
}
