package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {
	private final float  deliveryCharge;
	

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo,accNm,charges);
		this.deliveryCharge=deliveryCharge;
		
		// TODO Auto-generated constructor stub
	}
	public float getDeliveryCharge() {
		return deliveryCharge;
	}


	public void bookProduct(float deliveryCharge) {
		System.out.println("your product is booked and add the deliveryCharges here"+deliveryCharge);
		
		
	}
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", getDeliveryCharge()=" + getDeliveryCharge()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

	

	}
