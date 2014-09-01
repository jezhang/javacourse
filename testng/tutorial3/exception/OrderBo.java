package tutorial3.exception;

public class OrderBo {	
	public void save(Order order) throws OrderSaveException {
		if ( order == null) {
			throw new OrderSaveException("Order is empty!");
		}		
		
	}
	
	public void update(Order order) throws OrderUpdateException, OrderNotFoundException {
		
		if (order == null) {
			throw new OrderUpdateException("Order is empty!");
		}
		
		throw new OrderNotFoundException("Order is not exists"); 
	}
}
