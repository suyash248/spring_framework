package com.test.rmi.common;

import java.util.List;

public interface DeliveryServiceIntf {
	public void newDelivery(Delivery d);
	public List getDeliveries();
}
