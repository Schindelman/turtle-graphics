package edu.macalester.generator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciGeneratorTest {

    @Test
    public void generatorIncludesStart() {
        FibonacciGenerator gen = new FibonacciGenerator();
        assertEquals(1, gen.next());
        assertEquals(1, gen.next());
        assertEquals(2, gen.next());
    }

    @Test
    public void startsAt1() {
        FibonacciGenerator gen = new FibonacciGenerator();
        assertEquals(1, gen.next());
    }
}
