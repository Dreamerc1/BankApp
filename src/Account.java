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

        // Function showing main menu
        void showMenu() {
            char option = '\0';
            Scanner scanner = new Scanner(System.in);
            System.out.println("welcome, " + customerName + "!");
            System.out.println("Your ID is: " + customerID);
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("A. Check your balance");
            System.out.println("B. Make a deposit");
            System.out.println("C. Make a withdrawal");
            System.out.println("D. View previous transaction");
            System.out.println("E. Exit");

            do {
                System.out.println();
                System.out.println("Enter an option ");
                char option1 = scanner.next().charAt(0);
                option = Character.toUpperCase(option1);
                System.out.println();

                switch(option) {
                    // Case 'A' allows users to check their account balance
                    case 'A' :
                       System.out.println("................................");
                       System.out.println("Balance = £" + balance);
                       System.out.println("................................");
                       System.out.println();
                       break;
                       // Case 'B' allows users to deposit money
                    case 'B' :
                       System.out.println("Enter an amount to deposit: ");
                       int amount = scanner.nextInt();
                       deposit(amount);
                       System.out.println();
                       break;
                     // Case 'C' allows users to withdraw money
                     case 'C' :
                       System.out.println("Enter an amount to withdraw: ");
                       int amount2 = scanner.nextInt();
                       withdraw(amount2);
                       System.out.println();
                       break;
                    // Case 'D' allows users to veiw their recent transaction
                    case 'D' :
                       System.out.println("................................");
                       getPreviousTransaction();
                       System.out.println("................................");
                       System.out.println();
                       break;
                       // Case E: exists the user
                    case 'E' :
                    System.out.println("................................");
                    break;
                    default:
                    System.out.println("Error: Invalid option");
                    break;
                }
            } while(option != 'E');
            System.out.println("Thank you for banking with us!");
        }
    }
