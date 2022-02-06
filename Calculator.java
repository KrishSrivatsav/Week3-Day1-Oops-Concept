package week3.day1oopsconcept;

public class Calculator {
	
	
	
	public int overLoad(int a ,int b) 
	{
		System.out.println("Print overload");
		return b;
		
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int add = cal.overLoad(5,10);
		System.out.println(add);
		
		
	}
	
	

}
