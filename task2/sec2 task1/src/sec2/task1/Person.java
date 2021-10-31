/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sec2.task1;

public class Person {
    
    String name;
    String address;
    String phone_number;
    String email_address;

    public Person() {

    }
    public Person(String name , String address , String phone_number , String email_address)
    {      
                    
        this.name=name;
        this.address=address;
        this.phone_number =phone_number;
        this.email_address=email_address;
    }

    public String toString() {
        return  name + " Person";
    }
    
}
