package StrategyPattern;

public class Birds extends Animal {

	// The constructor initializes all objects

	public Birds(){
			
			super();
			
			setSound("Tweet");
			
			// We set the Flys interface polymorphically
			// This sets the behavior as a non-flying Animal
			
			flyingType = new ItFlys();
			
		}

}
