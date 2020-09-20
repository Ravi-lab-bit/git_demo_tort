package com.interfaceEx;

public class IciciBank implements RBI{

	
	@Override
	public void MiniBalanceForSaving() {
		// TODO Auto-generated method stub
		System.out.println("5000");
	}

	@Override
	public void MiniBalanceForCurrent() {
		// TODO Auto-generated method stub
		System.out.println("1000");
	}

	@Override
	public void RoIforSaving() {
		// TODO Auto-generated method stub
		System.out.println("5 %");
	}
	
	public void InternationalBanking() {
		// TODO Auto-generated method stub
		System.out.println("Corporate tax is 23 %");
	}

}
