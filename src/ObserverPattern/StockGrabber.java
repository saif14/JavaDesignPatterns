package ObserverPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	
	private ArrayList<Observer> observers;
	
	public double ibmPrice;
	public double aaplPrice;
	public double googlePrice;
	
	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);

	}

	@Override
	public void unregister(Observer deleteObserver) {
		
		int observerIndex = observers.indexOf(deleteObserver);
		
		System.out.println("Observer " + (observerIndex+1) + " deleted");
		
		observers.remove(observerIndex);

	}

	@Override
	public void notifyObserver() {
		for(Observer observer : observers) {
			observer.update(ibmPrice, aaplPrice, googlePrice);
		}

	}
	
	public void setIBMPrice(double newIBMPice) {
		this.ibmPrice = newIBMPice;
		notifyObserver();
	}
	
	public void setApplrice(double newAaplPice) {
		this.aaplPrice = newAaplPice;
		notifyObserver();
	}

	public void setGooglePrice(double newGooglePice) {
		this.googlePrice = newGooglePice;
		notifyObserver();
	}


}
