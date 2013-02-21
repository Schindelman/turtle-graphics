package edu.macalester.generator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SteppingGeneratorTest {

    @Test
    public void generatorSkipsComposites() {
        SteppingGenerator gen = new SteppingGenerator(10, 5);
        assertEquals(10, gen.next(), 0.0001);
        assertEquals(15, gen.next(), 0.0001);
    }

    @Test
    public void generatorIncludesStart() {
        SteppingGenerator gen = new SteppingGenerator(10, 5);
        assertEquals(10, gen.next(), 0.0001);
        assertEquals(15, gen.next(), 0.0001);
        assertEquals(20, gen.next(), 0.0001);
    }

    @Test
    public void startsAt2() {
        SteppingGenerator gen = new SteppingGenerator(10, 5);
        assertEquals(10, gen.next(), 0.0001);
    }
}
