package org.example;

public class Stack {

    private int element;
    private int size;

    public boolean isEmpty(){
        return  size == 0;
    }

    public void push(int i){
        element = i;
        size++;
    }

   public int pop() throws UnderFlowException{
        if (isEmpty()){
            throw  new UnderFlowException();
        }
        else {
            size--;
        }
        return element;
   }

   public int size(){
        return size;
   }

}
