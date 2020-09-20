package com.interfaceEx;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI i= new IciciBank();
		i.MiniBalanceForCurrent();
		i.MiniBalanceForSaving();
		i.RoIforSaving();
		
	}
	public void main1() {
		IciciBank b = new IciciBank();
		System.out.println();
		b.InternationalBanking();
	}
}
