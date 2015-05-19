import org.junit.Test;

import static org.junit.Assert.*;


public class MemFibonacciTest {

    @Test
    public void testFib() {
       int answer = MemFibonacci.fib(46);
        int correct = 1836311903;
        assertEquals(answer, correct);
    }

    @Test
    public void testFib2() {
        int answer = MemFibonacci.fib(46);
        int correct = 1836311903;
        assertEquals(answer, correct);
    }



}