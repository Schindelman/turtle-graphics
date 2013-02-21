package edu.macalester.generator;

public class FibonacciGenerator implements Generator {
	
	private int prevOne;
	private int prevTwo;
	
	private boolean firstOne;
	
	public FibonacciGenerator() {
		
		prevOne = 1;
		prevTwo = 0;
		firstOne = true;
	}
	
	public double next() {
		
		if(firstOne)
		{
			firstOne = false;
			return 1;
		}
		
		int retval = prevOne + prevTwo;
		
		prevTwo = prevOne;
		prevOne = retval;
		
		return retval;
	}

}
