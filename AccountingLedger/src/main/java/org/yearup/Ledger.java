package org.yearup;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
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
        input.nextLine();
        System.out.print("Enter the description:");
        String description = input.nextLine();
        System.out.print("Enter vendor name:");
        String vendor = input.nextLine();


                FileInputStream fileStream;
                Scanner fileScanner = null;

                FileWriter fileWriter = null;
                LocalDate date = LocalDate.now();

                try
                {
                    // 1 open file - for reading
                    fileStream = new FileInputStream("transactions.csv");
                    fileScanner = new Scanner(fileStream);
                    // open file for WRITING
                    fileWriter = new FileWriter("transactions.csv");

                    // skip first line (header row)
                    fileScanner.nextLine();
                }
                catch(IOException e)
                {
                    System.out.println("There was a problem with opening/closing the file.");
                    System.out.println(e.getMessage());
                }
                catch(Exception e)
                {
                    System.out.println("A general error has occurred:");
                    System.out.println(e.getMessage());
                }
                finally
                {
                    // clean up code
                    if(fileScanner != null)
                    {
                        // 3 close the stream
                        fileScanner.close();
                        try
                        {
                            fileWriter.close();
                        }catch (Exception ex){}
                    }
                }

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