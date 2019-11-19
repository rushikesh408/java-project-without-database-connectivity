package com.sms;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
        Teachers lizzy = new Teachers(1,"Lizzy",500);
        Teachers mellisa = new Teachers(2,"Mellisa",700);
        Teachers vanderhorn = new Teachers(3,"Vanderhorn",600);
        Teachers rushikesh = new Teachers(4,"rushikesh",5000);
        List<Teachers> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(rushikesh);
        teacherList.add(vanderhorn);


        Student tamasha = new Student(1,"Tamasha",4);
        Student rakshith = new Student(2,"Rakshith Vasudev",12);
        Student rabbi = new Student(3,"Rabbi",5);
        
        List<Student> studentList = new ArrayList<>();

        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshith);
        School ghs = new School(teacherList,studentList);
        
        Teachers megan = new Teachers(6,"Megan", 900);
       
        ghs.addTeacher(megan);
      
        tamasha.payees(5000);
        rakshith.payees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalmoneyeearned());
        
        rakshith.payees(5000);
        System.out.println("has earned $"+ghs.getTotalmoneyeearned());

        
        System.out.println("school payig salary");
        lizzy.receievesalary(lizzy.getSalary());
        System.out.println("ghs has paid or spent for salary to "+lizzy.getName() +
        		" and now has" + ghs.getTotalmoneyeearned());
      
        System.out.println(rakshith);
        System.out.println(mellisa);
        
       
        
        

	}

}
