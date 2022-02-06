package week3.day1oopsconcept;

public class MyVehicle {
	int num = 2345;
	public void printvehiclenum()
	{
		System.out.println("print the num");
	}
	
	public void getvehinum()
	{
		this.printvehiclenum();
		int num2  = this.num;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		Auto auto = new Auto();
		Audi audi = new Audi();
		
		
		vehicle.applyBrake();
		vehicle.soundHorn();
		
		car.openDoor();
		car.soundHorn();
		car.applyBrake();
		
		auto.resetMeter();
		auto.applyBrake();
		
		audi.applyBrake();
		audi.openDoor();
		audi.autoPark();
		audi.applyacce();
		audi.reverse();
		
		

	}

}
