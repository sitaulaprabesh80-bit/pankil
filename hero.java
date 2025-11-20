import java.util.Scanner;

/**
 * Write a description of class hero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hero{
    public static void main(String[] args){
    
        
        Scanner input=new Scanner (System.in);
        System.out.println("Enter first number");
        
        int firstnum= input.nextInt();
        System.out.println("my first number is:" +firstnum);
        System.out.println("enter second number");
        double secondnum= input.nextDouble();
        System.out.println("my second number is:" +secondnum);
        
        //Ternery operator
        
        System.out.println("ask for his/her age: ");
        int age= input.nextInt();
        
        String isvalid = (age >=18)? "Driving is allowed" : "Driving is not allowed" ;
        System.out.println(isvalid);
        
        
        
    }
}
        
        
        
        
        
        
        
        
        
  
