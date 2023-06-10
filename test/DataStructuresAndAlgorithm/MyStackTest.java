package DataStructuresAndAlgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    MyStack  stack;
    @BeforeEach
    void setUp() {
        stack = new MyStack(5);
    }
    @Test
    public void stackExistTest(){
        assertNotNull(stack);
    }
    @Test
    public void pushXPopXStackShouldBeEmptyTest(){
        MyStack stack = new MyStack(5);
        stack.push("E-String");
        stack.pop();
        assertTrue(stack.isEmpty());
    }
    @Test public void pushXAndYPopYStackShouldNotBeEmptyTest(){
        MyStack stack = new MyStack(5);
        stack.push("G-String");
        stack.push("E-String");
        stack.pop();
        assertFalse(stack.isEmpty());
    }
    @Test public void pushX_shouldeturnX__whenPopped_test(){
        stack.push("D-String");
        stack.push("E-String");
        stack.push("G-String");
        String actual = stack.pop();
        assertEquals("G-String", actual);
    }
    @Test public void pushXYZ_shouldReturnY__whenPoppedTwice_test(){
        stack.push("D-String");
        stack.push("E-String");
        stack.push("G-String");
        String actual = stack.pop();
        assertEquals("G-String", actual);
    }

   /* @Test
    public void newStackIsEmptyTest(){
        *//*  MyStack stack = new MyStack(5);*//*
        assertTrue(stack.isEmpty());
    }*/


}