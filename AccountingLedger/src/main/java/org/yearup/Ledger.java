package org.yearup;

import java.util.Scanner;

public class Ledger
{
    Scanner input = new Scanner(System.in);
    public void run(){
        String option = displayHomeScreen();
        while(true) {
            if (option.equalsIgnoreCase("D")) {
                // Send to deposit page
                displayDepositScreen();
            }
            else if (option.equalsIgnoreCase("P")){
                // Send to make a payment
                displayPaymentScreen();
            }
            else if(option.equalsIgnoreCase("L"))
            {
                displayLedgerScreen();
            }
            else if(option.equalsIgnoreCase("E")) {
                break;
            }
        }
    }

    private void displayLedgerScreen() {
        // Calculator and ledger functions
    }

    private void displayPaymentScreen() {
        // Get Payment information and save to CSV
        System.out.print("Enter the payment amount:");
        Float amount = input.nextFloat();


    }

    private void displayDepositScreen() {
        // Get Deposit information and save to CSV
    }

    private String displayHomeScreen() {
        System.out.println("What would you like to do?");
        System.out.println("D for add deposit");
        System.out.println("P for make a payment (Debit)");
        System.out.println("L for Ledger");
        System.out.println("E for Exit");
        System.out.print("Enter your selection:");
        String selection = input.nextLine();
        return selection;
    }
}