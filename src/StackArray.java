package com.company;
public class StackArray {

int size ;
int array[];
int top ;   // to work as a pointer

// making a constructor  to set the size
    public StackArray(int size  ) {
        this.size = size ;
        this.array = new int [size ] ;
        this.top = -1;
    }
// zero arg constructor
public StackArray () {

}



    // a function is empty  to check if stack is empty and is full to check if stack is full
    public boolean isEmpty () {
        return (top == -1 );
    }

    public boolean isFull () {
        return (size -1 == top );
    }

    // a method to push an element in the Stack
    public void push (int value ) {
        if (isFull()) System.out.println("Sorry Stack is full  .. ");
        else {
            top++ ;
            array[top] =  value ;
        }
    }

    // a method to to pop an element from the stack
    public int pop (){
        int x = array [top] ;
        top -- ;
        if (isEmpty())    {  System.out.println(" Sorry Stack is Empty !!! ... ");  return -1 ; }
        else {
           return ( x  );
        }

    }

// a method to print last element in the Stack without removing it from the Stack
    public void peek () {
        if(isEmpty()) System.out.println("sorry Stack is Empty .");
        else {
            int y = array[top];
            System.out.println("last element  : " + y);
        }
    }











}
