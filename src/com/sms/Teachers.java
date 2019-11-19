package com.sms;


/**
 * for keeping the track of id, name ans=d salary
 * @author RUSHIKESH
 *
 */
public class Teachers{
private int id;
private String name;
private int salary;
private int salaryearned;


/**
 * creates the new constructor for teacher
 * @param id of teacher
 * @param name of teacher
 * @param salary of teacher
 */

public Teachers(int id,String name,int salary){
	this.id=id;
	this.name=name;
	this.salary=salary;	
	this.salaryearned=0;
}

// returns id of teacher
public int getId() {
	return id;
}
// returns name of teacher
public String getName() {
	return name;
	
}

// returns salary of teacher

public int getSalary() {
	return salary;
}

// sets salary of teacher

public void setSalary(int salary) {
	this.salary=salary;
	}

public void receievesalary(int salary) {
	salaryearned+=salary;
	School.updateTotalmoneyspent(salary);
	
}
@Override
	public String toString() {
		
		return "total salary  earned by "+ getName() + " " + salaryearned;
	}

}
