package com.test.rmi.server;

import com.test.rmi.common.*;

import java.util.ArrayList;
import java.util.List;

public class DeliveryServiceImpl implements DeliveryServiceIntf {

	private List deliveries=new ArrayList();
	@Override
	public void newDelivery(Delivery del) {
		deliveries.add(del);
	}

	@Override
	public List getDeliveries() {
		
		return deliveries;
	}

}
