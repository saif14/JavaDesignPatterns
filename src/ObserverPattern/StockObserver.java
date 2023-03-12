package ObserverPattern;

public class StockObserver implements Observer {
	
	private double ibmPrice;
	private double aaplPrice;
	private double googlePrice;
	
	private static int obserIDTracker = 0;
	
	private int observerId;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerId = ++obserIDTracker;
		System.out.println("New Observer "+ this.observerId);
		stockGrabber.register(this);
	}

	@Override
	public void update(double ibmPrice, double aaplPrice, double googlePrice) {
		
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googlePrice = googlePrice;
		
		printThePrices();
	}

	private void printThePrices() {
		System.out.println(observerId + "\nIBM: " + ibmPrice + 
				"\nAAPL: " + aaplPrice + "\nGoogl: "+ googlePrice);
		
	}

}
