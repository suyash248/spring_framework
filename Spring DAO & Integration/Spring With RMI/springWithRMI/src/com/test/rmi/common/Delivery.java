package com.test.rmi.common;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Delivery implements Serializable {
	private String requesterName;
	private Date deliveryDate;
	
	public Delivery(String requesterName, Date deliveryDate){
		this.requesterName=requesterName;
		this.deliveryDate=deliveryDate;
	}

	public String toString(){
		SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
		String rt="[requesterName : "+requesterName+", deliveryDate : "+format.format(deliveryDate);
		return rt;
	}
	
	public String getRequestName() {
		return requesterName;
	}

	public void setRequestName(String requesterName) {
		this.requesterName = requesterName;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
}
