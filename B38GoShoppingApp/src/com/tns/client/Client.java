package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Client {
	
	public static void main(String[] args) {
		ShopFactory sf= new GSShopFactory();
		PrimeAcc pa=new GSPrimeAcc(101,"Rahul",500,true);
		pa.bookProduct(pa.getCharges());
		System.out.println(pa.toString());
		
		NormalAcc na=new GSNormalAcc(213,"Ravi",1000,70);
		na.bookProduct(na.getDeliveryCharge());
		na.toString();
	}

}

