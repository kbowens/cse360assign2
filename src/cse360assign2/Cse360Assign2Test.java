package cse360assign2;

public class Cse360Assign2Test {
	
	public static void main(String[] args)
	{
		Calculator myCalc = new Calculator();
		
		myCalc.add(4);
		myCalc.subtract(2);
		myCalc.multiply(2);
		myCalc.add(5);
		
		System.out.println(myCalc.getTotal());
		
		myCalc.divide(0);
		System.out.println(myCalc.getTotal());
		
		System.out.println(myCalc.getHistory());
	}

}
