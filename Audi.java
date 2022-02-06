package week3.day1oopsconcept;

public class Audi extends Car{
	
	public void autoPark()
	{
		
	}
	
	public void applyacce()
	{
		System.out.println("Applying accelerator");
		super.gear();
		
	}
	
	public int takeReverse(int a,int b)
	{
		int c = a-b;
		return c;
		
	}
	
	public static void main(String[] args) {
		Audi aud = new Audi();
		int print = aud.takeReverse(4, 2);
		System.out.println(print);
		
}
	
	
	
}
