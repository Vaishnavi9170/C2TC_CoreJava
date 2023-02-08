package com.tns.application;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		MMSavingAcc mmsaving=new MMSavingAcc(accNo,accNm,accBal,isSalary);
		// TODO Auto-generated method stub
		return mmsaving;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent=new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		// TODO Auto-generated method stub
		return mmcurrent;
	}
	

}
