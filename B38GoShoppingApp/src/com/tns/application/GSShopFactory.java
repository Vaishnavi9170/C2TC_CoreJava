package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public GSPrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc gsprime=new GSPrimeAcc(accNo,accNm,charges,isPrime);
		// TODO Auto-generated method stub
		return gsprime;
	}

	@Override
	public GSNormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc gsnormal=new GSNormalAcc(accNo,accNm,charges,deliveryCharges);
		// TODO Auto-generated method stub
		return gsnormal;
	}

}
