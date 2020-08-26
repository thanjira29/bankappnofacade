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
 * @author thanjira
 */
public class MyFacade {
    private ArrayList<CustomerIf> customers = new ArrayList();
    MyFacade() {
        ArrayList<AccountIf> cust1Accounts = new ArrayList();
        AccountIf acc = new BankAccount(12345);
        acc.deposit(500);
        cust1Accounts.add(acc);
        acc = new BankAccount(12346);
        acc.deposit(1000);
        cust1Accounts.add(acc);
        CustomerIf cust1 = new BankCustomer("John", cust1Accounts);
        customers.add(cust1);

        ArrayList<AccountIf> cust2Accounts = new ArrayList();
        acc = new BankAccount(12347);
        acc.deposit(600);
        cust2Accounts.add(acc);
        acc = new BankAccount(12348);
        acc.deposit(1200);
        cust2Accounts.add(acc);
        CustomerIf cust2 = new BankCustomer("Mary", cust2Accounts);
        customers.add(cust2);        
    }

    public void doDeposit(double amount, CustomerIf cust, int accNo) {
        cust.getAccount(accNo).deposit(amount);
    }

    public AccountIf getBankAccount(CustomerIf cust, int accNo) {
        return cust.getAccount(accNo);
    }

    public CustomerIf getBankCustomer(String custName) {
        for(CustomerIf custn : customers) {
            if(custn.getCustomerName().equals(custName)) {
                return custn;
            }
        }
        return null;
    }
}
