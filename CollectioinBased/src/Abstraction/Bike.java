package Abstraction;

public abstract class Bike {

	Bike(){
		System.out.println("Bike Started");
	}
	
	abstract void run();  
    void changeGear(){
    	System.out.println("Need To Gear Change");
    }
}
