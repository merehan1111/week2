/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sec2.task1;

/**
 *
 * @author DELL
 */
public class Student extends Person {
    private int status;
    final String status1 = "Freshman";
    final String status2 = "Sophomore";
    final String status3 = "Junior";
    final String status4 = "Senior";
    public Student(String name, String address, String phone, String email , int status) {
        super(name,address,phone,email);
        this.status=status;
       
    }

    public String toString() {
        return name + " Student";
    }

    
}
