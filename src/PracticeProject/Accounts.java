package PracticeProject;

public class Accounts {

    double balance = 0.00;

    static int lastAccNum = 1000;
    int accNum;

    static int lastId = 0;
    int customerId;

    String accType;

    public int createAccount(String cAccType){
        accType = cAccType;
        lastId++;
        customerId = lastId;
        lastAccNum++;
        accNum = lastAccNum;
        return accNum;
    }

    public double deposit(int accNum, double depositAmt){
        if (depositAmt > 0) {
            balance += depositAmt;
        } else {
            System.out.println("Invalid deposit amount entered: " + depositAmt);
        }
        return balance;

    }

    public double withdraw(int accNum, double withdrawAmt){
        if (withdrawAmt<= balance&& withdrawAmt>0) {
            balance -= withdrawAmt;
        } else {
            System.out.println("Invalid withdraw amount entered: " + withdrawAmt);
        }
        return balance;
    }

    public double balance(int accNum){

        return balance;
    }
}


/**
 * methods
 *      createAccount()
 *          input parameter : 1
 *          output parameter : 1 (4 digits of created account #)
 *
 *      withdraw()
 *          input parameter: 2
 *              accountNum, amount
 *          output :
 *
 *      deposit()
 *          input parameter: 2
 *              accountNum, amount
 *          output :
 *
 *       balance()
 *          input parameter: 1
 *              accountNum
 *          output parameter: 1
 *              balance amount
 */

