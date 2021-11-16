import java.io.*;
public class ExcepTest 
{

   public static void main (String []args)
    {
    CheckingAccount c= new CheckingAccount (101);
    System.out.println("Depositing $500....");
    c.deposite(500.00);
    System.out.println("Withdrawing $100....");
    c.withdraw(100.00);
    System.out.println("Withdrawing $500....");
    c.withdraw(500.00);
    System.out.println("Muhammad Jawad Ali _BCSE_5C_135");
    } 
}

