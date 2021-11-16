import java.io.*;
public class CheckingAccount 
{
       private double balance;
    private int number;
    public CheckingAccount(int number )
    {
    this.number=number;
    }
    public void deposite(double amount)
    {
    balance +=amount;
    }

    public void withdraw(double amount)
    {
    if (amount<=balance)
    {
    balance-=amount;
    }
    else
    {
        double needs =amount - balance;
    }   
}
    public double getBalance()
    {
    return balance;
    }
    public int getNumber()
    {
    return number;
    }
}
