package com.tns.framework;

public abstract class SavingAcc extends BankAcc {
	public boolean isSalary;
	private final float creditLimit=0;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary=isSalary;
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float accBal) {
		System.out.println("your amount is withdrawn,the account balance is"+accBal);
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", creditLimit=" + creditLimit + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public abstract float getwithdraw();
	

}
