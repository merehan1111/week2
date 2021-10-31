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
public class Staff extends Employee {
    
  public   String title;

    public Staff(String name, String address, String phone_number, String email_address, String office, double salary , String title) 
    {        
       super( name, address, phone_number,email_address, office, salary);
        this.title = title;
    }

    public String toString() {
        return name + " Staff";
    }
    
}
