/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregation;

/**
 *
 * @author DELL
 */
public class Agregation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Subject subject1=new Subject(9,"merehan",10.20);
      Address address1=new Address(6,"minia","egypt");
      Student student1=new Student("merehan", 9 , 2.5 , subject1 , address1);
      
       student1.display();
       
    }
    
}
