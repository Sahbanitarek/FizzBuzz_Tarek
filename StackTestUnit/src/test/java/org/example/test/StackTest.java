package org.example.test;

import org.example.Stack;
import org.example.UnderFlowException;
import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    private final Stack stack  = new Stack();

    @Test
    public void should_create_an_empty_stack(){
     Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void should_not_be_empty_after_a_push(){
        stack.push(0);
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(1, stack.size());
    }

    @Test
    public void should_be_empty_after_push_and_pop() throws UnderFlowException {
        stack.push(0);
        stack.pop();
        Assert.assertTrue(stack.isEmpty());
        Assert.assertEquals(0, stack.size());
    }

    @Test
    public void should_have_size_after_two_push(){
        stack.push(0);
        stack.push(1);
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(2, stack.size());
    }

    @Test
    public void should_throw_UNDERFLOWEXCEPTION_when_pop_an_empty_stack(){
        Exception exception = Assert.assertThrows(UnderFlowException.class, stack::pop);
        String message = "Il est impossible de retirer un élément d'une pile vide.";
        String actualMessage = exception.getMessage();
        Assert.assertTrue(actualMessage.contains(message));
    }

    @Test
    public void should_pop_X_after_push_X() throws UnderFlowException{
        stack.push(10);
        Assert.assertEquals(10, stack.pop());
        stack.push(20);
        Assert.assertEquals(20, stack.pop());
    }
}
