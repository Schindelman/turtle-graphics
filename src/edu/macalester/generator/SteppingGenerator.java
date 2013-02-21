package edu.macalester.generator;

public class SteppingGenerator implements Generator {
	
	private double start;
	
	private double step;
	
	private int numSteps;
	
	public SteppingGenerator(double start, double step) {
		
		this.step = step;
		
		this.start = start;
		
		this.numSteps = -1;
		
	}
	
	public double next() {
		
		++numSteps;
		
		return (start + step*numSteps);
	}
}
