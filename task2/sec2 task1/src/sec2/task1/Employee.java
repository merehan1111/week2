/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sec2.task1;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Employee extends Person {
    
    String office;
    double salary;
    Date date_hired = new Date();
    public Employee(String name, String address, String phone_number, String email_address, String office, double salary)
    {
        super(name, address, phone_number, email_address);
        this.office = office;
        this.salary = salary;
    }

    public String toString() {
        return name + " Employee";
    }
    
}
