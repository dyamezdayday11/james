package main;

import java.util.Scanner;
import banking.bankingClass;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        bankingClass bank = new bankingClass();
        int attempt = 3;
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = in.nextInt();
        
        switch(choice){
            case 1:
                 while( attempt != 0){
                     System.out.println("Enter your Account No: ");
                int accountNo = in.nextInt();

                System.out.println("Enter your Pin: ");
                int pin = in.nextInt();
                 
                    if(bank.verifyAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                        System.exit(0);
                    }else{
                        attempt--;
                        System.out.println("INVALID ACCOUNT No OR Pin! Left attempt" + attempt);
                    }
                   if ( attempt == 0 ) {
                       System.out.println("Try Again Later!");
                   }
                 }
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                
        
        }
            
    }
    
}
