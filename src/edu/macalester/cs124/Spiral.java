package edu.macalester.cs124;

import java.awt.Color;

import edu.macalester.generator.FibonacciGenerator;
import edu.macalester.generator.Generator;
import edu.macalester.turtle.Turtle;
import edu.macalester.turtle.TurtleProgram;

public class Spiral extends TurtleProgram {
	
    public void run() {
        spiral(Color.BLUE, 90, new FibonacciGenerator());
        
        println("Done!");
    }

	private void spiral(Color color, double angle, Generator gen) {
		setTurtleSpeedFactor(0);
        
        Turtle turtle = new Turtle(getWidth() / 2, getHeight() / 2);
        add(turtle);
        turtle.setColor(color);
        turtle.setStepSize(1);
        
        int step = 0;
        while(turtleIsNearScreen(turtle)) {
            turtle.forward(step);
            turtle.left(angle);
            step += gen.next();
        }
        remove(turtle);
	}

    private boolean turtleIsNearScreen(Turtle turtle) {
        double margin = Math.max(getWidth(), getHeight()) / 2;
        return turtle.getX() > -margin
            && turtle.getY() > -margin
            && turtle.getX() < getWidth()  + margin
            && turtle.getY() < getHeight() + margin;
    }
}
