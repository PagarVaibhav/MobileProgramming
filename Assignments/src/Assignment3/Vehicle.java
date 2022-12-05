package Assignment3;
public interface Vehicle {
		public abstract void cleanVehicle();
		default void startVehicle() {
			System.out.println("Vehicle started");}
		default void sensor() {
			System.out.println("Sensor added");}
		static void fuelCheck() {
			System.out.println("checking fuel");}
}
class I20 implements Vehicle{
	@Override
	public void cleanVehicle() {
		System.out.println("Cleaning Of I20 Car Continue");
	}
	@Override
	public void sensor() {
		System.out.println("I20 Car Sensors");
	}
}
class XUV700 implements Vehicle{
	@Override
	public void cleanVehicle() {
		System.out.println("Cleaning of XUV700 Car Completed");
	}
}
class Test {
	public static void main(String[] args) {
		Vehicle v1=new I20();
		v1.cleanVehicle();
		v1.sensor();
		v1.startVehicle();
		Vehicle.fuelCheck();
		System.out.println("==========================");
		Vehicle v2=new XUV700();
		v2.cleanVehicle();
		v2.sensor();
		v2.startVehicle();
		Vehicle.fuelCheck();
	}
}
