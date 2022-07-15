package com.iu.himart;

public class Phone extends Himart {
	
	private String company;
	
	public Phone() {
		this.company = "삼성";
		this.setBrand("LED");
		this.setPoint(100);
		this.setPrice(10000);
	}
	
	
	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}
	
	public void info() {
		super.info();
		System.out.println(this.getCompany());
	}



	
	

}
