package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(1468,"vaishnavi",5000,true);
		sa.withdraw(sa.getwithdraw());
		System.out.println(sa.toString());
		
		CurrentAcc ca = new MMCurrentAcc(1130,"Chinni",8000,100);
		ca.withdraw(ca.getwithdraw());
		ca.toString();
		// TODO Auto-generated method stub

	}

}
