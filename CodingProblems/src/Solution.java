

import java.io.*;
import java.text.MessageFormat;
import java.util.*;

class BankAccount{
	// variables
	String accountType;
	int units;
	String currency;
	
	//constructor
	public BankAccount(String InCurrency, int InUnits){
		this.currency=InCurrency;
		this.units= InUnits;
	}

	public Class<? extends BankAccount> getAccountType() {
		return this.getClass();
	}


	public void setAccountType(String accounttype) {
		this.accountType = accounttype;
	}


	public int getUnits() {
		return units;
	}


	public void setUnits(int units) {
		this.units = units;
	}

	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
}

class SavingsAccount extends BankAccount{

	public SavingsAccount(String InCurrency, int InUnits) {
		super(InCurrency, InUnits);
		this.accountType = "Savings";
	}
	
}

class CheckingAccount extends BankAccount{

	public CheckingAccount(String InCurrency, int InUnits) {
		super(InCurrency, InUnits);
		this.accountType = "Checking";
	}
}

class BrokerageAccount extends BankAccount{

	public BrokerageAccount(String InCurrency, int InUnits) {
		super(InCurrency, InUnits);
		this.accountType = "Brokerage";
	}
	
}


public class Solution {

	private static final String TEXT =  "I am a {0} account with {1,number,#} units of {2} currency";

    public static void main(String args[] ) throws Exception {

        List<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new SavingsAccount("USD",3));//Savings
        accounts.add(new SavingsAccount("EUR",2));//Savings
        accounts.add(new CheckingAccount("HUF",100));//Checking
        accounts.add(new CheckingAccount("COP",10000));//Checking
        accounts.add(new BrokerageAccount("GBP",2));//Brokerage
        accounts.add(new BrokerageAccount("INR",600));//Brokerage
        
        accounts.stream().forEach(
                                    account -> System.out.println(
                                        MessageFormat.format(TEXT,
                                            new Object[]{
                                            account.getAccountType().getName(),//make this work
                                            account.getUnits(),//make this work
                                            account.getCurrency()//make this work
                                                           })));
    }
}