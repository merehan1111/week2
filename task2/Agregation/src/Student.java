/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Student {
    String name;
    int id;
    double gpa;
    Subject subject;
    Address address;
    public Student(String name , int id , double gpa , Subject subject , Address address )
    {
 
       this.name=name;
       this.id=id;
       this.gpa=gpa;
       this.subject=subject;
       this.address=address;
     
 }
  void display()
  {
      System.out.print("Name is :"+name+ "ID is :"+id+"GPA is : "+gpa);
      System.out.print( " the Subject is : "+subject.id+" "+subject.name+" "+subject.hours);
      System.out.print(" the Address is :"+address.streetNO+" "+address.city+" "+address.country);
      
  }
    
    
}
