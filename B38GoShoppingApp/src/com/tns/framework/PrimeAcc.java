package com.tns.framework;


public abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	private static final float delivaryCharge=0;
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		
		super(accNo,accNm,charges);
		this.isPrime=isPrime;
		// TODO Auto-generated constructor stub
	}
	public void bookProduct(float charges) {
		System.out.println("your product is booked and ur charges are"+charges);
		
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getCharges()=" + getCharges() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
