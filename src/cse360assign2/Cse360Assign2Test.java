package cse360assign2;

public class Cse360Assign2Test {
	
	public static void main(String[] args)
	{
		Calculator myCalc = new Calculator();
		
		myCalc.add(7);
		myCalc.subtract(2);
		myCalc.multiply(6);
		myCalc.divide(3);
		
		System.out.println(myCalc.getTotal());
		
		myCalc.divide(0);
		System.out.println(myCalc.getTotal());
	}

}
