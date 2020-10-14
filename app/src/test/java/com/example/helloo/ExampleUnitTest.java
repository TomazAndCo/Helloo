package com.example.helloo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void add() {
        MainActivity m=new MainActivity();
        assertEquals(m.Max(1, 2) , 2);
    }
    @Test
    public void addi() {
        MainActivity m=new MainActivity();
        assertEquals(m.Max(5, 2) , 5);
    }
    @Test
    public void addit() {
        MainActivity m=new MainActivity();
        assertEquals(m.Max(2, 2) , 2);
    }
    @Test
    public void additi() {
        MainActivity m=new MainActivity();
        assertEquals(m.Max(0, 10) , 10);
    }
    @Test
    public void additio() {
        MainActivity m=new MainActivity();
        assertEquals(m.Min(1, 2) , 1);
    }
    @Test
    public void addition() {
        MainActivity m=new MainActivity();
        assertEquals(m.Min(1, 5) , 1);
    }
    @Test
    public void addition_() {
        MainActivity m=new MainActivity();
        assertEquals(m.Min(2, 2) , 2);
    }
    @Test
    public void addition_i() {
        MainActivity m=new MainActivity();
        assertEquals(m.Min(10, 2) , 2);
    }
}