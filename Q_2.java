/*Q2 : Develop a class BankAccount having following data members : (10 Marks)
        int accno
        double balance
        Write appropriate constructors to initialize data members
        Define the following functions :
        withdraw : balance will reduce
        deposit : balance will increase
        show : display accno and balance
        If user tries to withdraw more than the balance, use exception handling code.
        Demonstrate the concept of exception handling in main() function.*/

import java.util.Scanner;

class BankAccount
{
    int accno;
    double balance;

    public BankAccount(int accno,double balance)
    {
        this.accno=accno;
        this.balance=balance;
    }

    public void withdraw(double amount)
    {
        if(balance < amount)
        {
            try
            {
                System.out.println("Invalid amount entered");
            }
            catch(Exception e)
            {
                System.out.println("Error : withdrawal amount should be less than the balance");
            }
        }
        else
        {
            balance = balance - amount;
            System.out.println("balance of account after withdraw is : " + balance);
        }
    }

    public void deposite(double amount)
    {
        balance = balance + amount;
        System.out.println("balance of account after depositing amount is : "+balance);
    }

    public void show_account_details()
    {
        System.out.println("account number : "+accno);
        System.out.println("balance of account : "+balance);
    }

}

public class Q_2
{
    public static void main(String args[])
    {
        BankAccount ba = new BankAccount(123,10000);
        ba.show_account_details();
        ba.withdraw(12000);
        ba.deposite(12000);
    }
}
