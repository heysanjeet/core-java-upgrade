package com.heysanjeet.ds;

public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    Stack(int maxSize){
        this.maxSize=maxSize;
        stackArray=new long[maxSize];
        top=-1;
    }

    public void push(int value){
        top++;
        stackArray[top]=value;
    }

    public long pop(){
        long old_value=stackArray[top];
        top--;
        return old_value;

    }

    public int size(){
        return top+1;
    }

}
