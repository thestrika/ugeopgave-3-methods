import java.util.Scanner;
public class Opgave1 {

    //Globale variable og erklæringer
    Scanner myScanner = new Scanner(System.in);
    String[] menu = {"View balance", "Deposit", "Withdraw"};
    double balance;
    boolean isRunning = true;

    //Metoder
    int getUserInput(){
        System.out.println("=====================");
        System.out.println("Choose your number:");
        int userInput = myScanner.nextInt();
        return userInput;
    }

    void displayMenu(){
        for(int i = 0; i < menu.length; i++){
            System.out.println(i + 1 + ". " + menu[i]);
        }
    }

    void deposit(){
        double depositAmount = getUserInput();
        balance += depositAmount;
        System.out.println("+ Deposited " + depositAmount + "$");
        System.out.println("=====================");
    }

    void withdraw(){
        double withdrawAmount = getUserInput();
        if(balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println("- Withdrew " + withdrawAmount + "$");
            System.out.println("=====================");
        }
        else{
            System.out.println("Not enough funds");
        }
    }


    void printBalance(){
        System.out.println("=====================");
        System.out.println("Balance: " + balance + "$");
        System.out.println("=====================");
    }



    void main() {

        while (isRunning) {

            displayMenu();

            switch (getUserInput()) {
                case 1:
                    System.out.println("View balance");
                    printBalance();
                    break;
                case 2:
                    System.out.println("Deposit");
                    deposit();
                    break;
                case 3:
                    System.out.println("Withdraw");
                    withdraw();
                    break;
                default:
                    System.out.println("Invalid number");
            }


        }
    }

}
