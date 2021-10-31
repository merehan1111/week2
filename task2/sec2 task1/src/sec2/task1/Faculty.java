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
public class Faculty extends Employee{
    
    double work_hour;
    String rank;
    public Faculty(String name, String address, String phone_number, String email_address, String office, double salary, double work_hour, String rank)
    {        
        super(name, address, phone_number, email_address, office, salary);
        this.work_hour = work_hour;
        this.rank = rank;
    }

    public String toString() {
        return name + " Faculty";
    }

}

    

