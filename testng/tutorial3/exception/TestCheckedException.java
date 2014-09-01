package tutorial3.exception;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCheckedException {
	
	OrderBo orderBo;
	Order data;
	
	@BeforeTest
	void setup() {
		orderBo = new OrderBo();
		
		data = new Order();
		data.setId(1);
		data.setCreatedBy("mkyong");
	}
	
	@Test (expectedExceptions = OrderSaveException.class)
	public void throwIfOrderIsNull() throws OrderSaveException {
		orderBo.save(null);
	}
	
	@Test(expectedExceptions = { OrderUpdateException.class, OrderNotFoundException.class})
	public void throwIfOrderIsNotExists() throws OrderUpdateException, OrderNotFoundException {
		orderBo.update(data);
	}

}
