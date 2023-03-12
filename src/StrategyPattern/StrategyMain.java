package StrategyPattern;

public class StrategyMain {

	public static void main(String[] args) {
		Animal doggy = new Dog();
		Animal tweety = new Birds();
		
		System.out.println("Dog: " + doggy.tryToFly());
		
		System.out.println("Bird: " + tweety.tryToFly());

	}

}
