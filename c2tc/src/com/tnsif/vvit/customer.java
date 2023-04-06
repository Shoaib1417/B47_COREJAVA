package com.tnsif.vvit;

public class customer {


	private String customername;
    private int customerid;
    private String customercity;
    
    public customer(){
    
    	
    }
    
	public customer(String customername, int customerid, String customercity) {
		super();
		this.customername = customername;
		this.customerid = customerid;
		this.customercity = customercity;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomercity() {
		return customercity;
	}

	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}


}
