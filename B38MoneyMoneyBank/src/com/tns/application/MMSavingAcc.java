package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float accBal) {
		System.out.println("Dear Saving Account user, your amount is withdrawn ,the account balance is"+accBal);
	}
	@Override
	public String toString() {
		return "MMSavingAcc [isSalary=" + isSalary + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	@Override
	public float getwithdraw() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
