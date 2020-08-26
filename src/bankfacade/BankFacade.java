/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyFacade obj = new MyFacade();
        AccountIf acc;

        CustomerIf cust1 = obj.getBankCustomer("John");
        System.out.println("Customer and account information");
        System.out.println("Name = " + cust1.getCustomerName());
        System.out.println("Has " + cust1.getNumAccounts() + " accounts");

        acc = obj.getBankAccount(cust1, 12345);
        System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
        acc = obj.getBankAccount(cust1, 12346);
        System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());

        System.out.println("Do Deposit Account Number 12345");
        obj.doDeposit(500, cust1, 12345);
        System.out.println("Account Number " + acc.getAccountNumber() + " has " + acc.getBalance());

        System.out.println("--- All Account ---");
        ArrayList<AccountIf> accounts1 = obj.getBankCustomer("John").getllAccounts();
        for(AccountIf accounted : accounts1) {
            System.out.println("Account Number " + accounted.getAccountNumber() + " has " + accounted.getBalance());
        }
        
        System.out.println("..............");

        CustomerIf cust2 = obj.getBankCustomer("Mary");
        System.out.println("Customer and account information");
        System.out.println("Name = " + cust2.getCustomerName());
        System.out.println("Has " + cust2.getNumAccounts() + " accounts");

        acc = obj.getBankAccount(cust2, 12347);
        System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
        acc = obj.getBankAccount(cust2, 12348);
        System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());

        System.out.println("Do Deposit Account Number 12348");
        obj.doDeposit(1200, cust2, 12348);
        System.out.println("Account Number "+acc.getAccountNumber() + " has " + acc.getBalance());

        System.out.println("--- All Account ---");
        ArrayList<AccountIf> accounts2 = obj.getBankCustomer("Mary").getllAccounts();
        for(AccountIf accounted : accounts2) {
            System.out.println("Account Number " + accounted.getAccountNumber() + " has " + accounted.getBalance());
        }      
    }
    
}
    

