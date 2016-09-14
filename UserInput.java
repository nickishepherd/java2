package userinput;


import java.util.Scanner;
 
public class UserInput {

     
    public static void main(String[] args) {
        
        System.out.println("what is your name?");
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        
        System.out.println("what is your last name?");
        Scanner sc1 = new Scanner(System.in);
        String lastname=sc1.nextLine();
        
        System.out.println("what is your card number?");
        Scanner sc2 = new Scanner(System.in);
        String cardnumber=sc2.nextLine();
       
        System.out.println("what is your pin?");
        Scanner sc3 = new Scanner(System.in);
        String pin=sc3.nextLine();
        
        System.out.println(name);
        System.out.println(lastname);
        System.out.println(cardnumber);
        System.out.println(pin);
        
    }
    
}
