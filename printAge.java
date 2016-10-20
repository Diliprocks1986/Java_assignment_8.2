//Program to generate a user-defined exception called NegativeAgeException if user inputs negative value for age.

// NegativeAgeException class extending Exception class
class NegativeAgeException extends Exception{  
 NegativeAgeException(String s){  
  super(s);  
 }  
}  

class checkAge{  
// age Variable for store user input
   static int age;
// validate method to check input is - or +
   static void validate()throws NegativeAgeException{ 
// Asking user input
   System.out.print(" Please Enter your Age: ");
// reading user input
   age = Integer.parseInt(System.console().readLine());
// checking user input is negetive or positive
     if(age<0)  
// if user input is negetive it throw custom NegativeAgeException 
      throw new NegativeAgeException("You have Entered a Negetive Number Please Try again!");  
     else  
// if user input is positive simply print the age
      System.out.println(" Your Age is: " + age);  
   }  
 }  
public class printAge{ 
// main method
   public static void main(String args[]){  
// checkAge object creation
      checkAge ca = new checkAge();
// trying exception
	    try{ 
		// calling validate method of ca object
	  ca.validate();
	 // catching exception
	  }catch(Exception m){System.out.println("Exception occured: "+ m);}  
	 	  
  }  
}