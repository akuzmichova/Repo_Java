package PracticeProject;

import java.util.Scanner;

public class Customer extends Accounts{

    String name;
    String ssn;
    String address;

    public Customer(String cName, String cSsn, String cAccType) {
        name = cName;
        ssn = cSsn;
        createAccount(cAccType);
        System.out.println("\nCongratulations for your new account " + name +"!"+
                "\nAccount number: " + accNum);
    }
    public Customer(String cName, String cSsn, String cAddress, String cAccType) {
        name = cName;
        ssn = cSsn;
        address = cAddress;
        createAccount(cAccType);
        System.out.println("\nCongratulations for your new account " + name +"!"+
                 "\nAccount number: " + accNum);
    }
    Scanner input = new Scanner(System.in);
    public void editDetails() {
        System.out.println("\nDo you want to edit your name?");
        String yesOrNo = input.next();
        if (yesOrNo.trim().equalsIgnoreCase("yes")) {
            System.out.println("\nPlease provide your new name: ");
            name = input.next();
            System.out.println("\nDo you want to edit your address?");
            String yesOrNo1 = input.next();
            if (yesOrNo1.trim().equalsIgnoreCase("yes")) {
                System.out.println("\nPlease provide your new address: ");
                address = input.next();
            }
        } else if (yesOrNo.trim().equalsIgnoreCase("no")) {
            System.out.println("\nDo you want to edit your address?");
            String yesOrNo2 = input.next();
            if (yesOrNo2.trim().equalsIgnoreCase("yes")){
                System.out.println("\nPlease provide your new address: ");
                address = input.next();
            }
        }
        System.out.println("\nCustomer name: " + name + "\nCustomer address: " + address);
        }

        public void createAccount() {
            System.out.println("\nPlease enter account type");
            String accTypeString = input.next();
            if (accTypeString.trim().equalsIgnoreCase("savings")) {
                lastAccNum++;
                accNum = lastAccNum;
                System.out.println("\nSavings account has been created" +
                        "\nLast 4-digits of account number: " + accNum);
            } else if (accTypeString.trim().equalsIgnoreCase("checking")) {
                lastAccNum++;
                accNum = lastAccNum;
                System.out.println("\nChecking account has been created" +
                        "\nLast 4-digits of account number: " + accNum);
            } else {
                System.out.println("Invalid data entered");
            }
        }

        public void showAccountBalance() {
            System.out.println("\nPlease enter your account number: ");
            int accNumber = input.nextInt();
            System.out.println("\nAccount number: " + accNum +
                    "\nBalance: $" + balance);
        }

        public void showAllAccountBalance() {
            System.out.println("\nYou have total " + lastId + " account(s)");
            System.out.println("Account number: " + accNum +
                    "\nBalance: $" + balance);
        }

        public void makeDeposit() {
            System.out.println("\nTo make deposit please provide account number: ");
            int accNumber = input.nextInt();
            if (accNumber == accNum) {
                System.out.println("\nPlease enter deposit amount: ");
                int depositAmt = input.nextInt();
                if (depositAmt > 0) {
                    deposit(accNumber, depositAmt);
                    System.out.println(depositAmt + " has been deposited successfully" +
                            "\nYour updated balance: $" + balance);
                } else {
                    System.out.println("Invalid deposit amount entered: " + depositAmt);
                }
            } else {
                System.out.println("Invalid account number");
            }
        }

        public void makeWithdraw() {
            System.out.println("\nTo make withdraw please provide account number: ");
            int accNumber = input.nextInt();
            if (accNumber == accNum) {
                System.out.println("\nPlease enter withdraw amount");
                int withdrawAmt = input.nextInt();
                if (withdrawAmt <= balance && withdrawAmt > 0) {
                    withdraw(accNum, withdrawAmt);
                    System.out.println("\nPlease collect: $" + withdrawAmt +
                            "\nYour updated balance: $" + balance);
                }  else {
                    System.out.println("Invalid withdraw amount entered: " + withdrawAmt);
                }
            } else {
                System.out.println("Invalid account number");
            }
        }

}

/**
 * Customer ->
 *      Name
 *      SSN
 *      Address
 *
 *          methods
 *          editDetails()
 *              input parameter : none
 *              output : show the updated info.
 *              make it interactive, ask user for the field wanna edit, and new value
 *          createAccount()
 *              input parameter : none
 *              if input is savings, create a savings account
 *              if input is checking, create a checking account
 *              if input is something else, show error
 *              make it interactive, ask user for account type
 *              show:
 *                  Savings account has been created.
 *                  Last 4-digits of account number is XXXX
 *          showAccountBalance()
 *              input parameter : none
 *              make it interactive, ask user for account number
 *              show:
 *                  Account number:
 *                  Balance:
 *          showAllAccountBalance()
 *              show:
 *                  You have total X account.
 *                  Account number:
 *                  Balance:
 *
 *                  Account number:
 *                  Balance:
 *
 *                  Account number:
 *                  Balance:
 *          makeWithdraw:
 *              make it interactive, ask user for account number
 *              if valid account number, then ask for amount
 *              if amount is valid, make withdraw happen
 *              show:
 *                  Please collect $XXXX.YY amount
 *                  Your updated balance: $NNNN.MM
 *          makeDeposit:
 *              make it interactive, ask user for account number
 *              if valid account number, then ask to enter the amount
 *              if amount is valid, make deposit happen
 *              show:
 *                  Amount has been deposited successfully
 *                  Your updated balance: $NNNN.MM
 */