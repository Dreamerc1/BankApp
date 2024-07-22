import java.util.Scanner;

public class Account {
    //Class Variables
    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerID;

    //Class constructor
    Account(String cname, String cid){
        customerName = cname;
        customerID = cid;
    }

     // Function for Depositing money
     void deposit(int amount){
        if (amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
     }

     // Function for Withdrawing money
     void withdraw(int amount){
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
     }
    // Function for showing previous transaction
    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("no transaction occured");
        }
        }

        }
    }

    
    
}
