package ObserverPattern;

public class GrabStocks {

	public static void main(String[] args) {
		StockGrabber grabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(grabber);
		
		grabber.setIBMPrice(172.00);
		grabber.setApplrice(175.00);
		grabber.setGooglePrice(134.00);
		
		
		StockObserver observer2 = new StockObserver(grabber);
		
		grabber.setIBMPrice(122.00);
		grabber.setApplrice(125.00);
		grabber.setGooglePrice(234.00);
		
		grabber.unregister(observer1);
		
		grabber.setIBMPrice(172.00);
		grabber.setApplrice(175.00);
		grabber.setGooglePrice(134.00);
		
//		Runnable getIbm = new GetTheStock(grabber, 2, "IBM", 197.00);
//		Runnable getAaple = new GetTheStock(grabber, 2, "AAPL", 197.00);
//		Runnable getGoogle = new GetTheStock(grabber, 2, "GOOGLE", 197.00);
//		
//		new Thread(getIbm).start();
//		new Thread(getAaple).start();
//		new Thread(getGoogle).start();
		
		
	}

}
