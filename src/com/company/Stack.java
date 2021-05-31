package com.company;

public class Stack {
    private Node top ; // the first node

    // nest class to define linkedlist node
    private class Node {
        int data;
        Node next;
    }


    public Stack () {
        top = null;
    }

    // a method to push an element in the Stack
    public void push (int data) {
        Node newNode = new Node ();
        if(newNode == null) System.out.println("Stack can't allocate memory ");
        else {
            newNode.data = data;
            newNode.next = top;
            top = newNode; // hna m3nah al top wa2f 3nd a5r element da5al lifo   -----------
        }
    }

    // pop method to remove and return last element in the Stack
    public int pop () {
        if(top == null) {
            System.out.println("sorry  stack is Empty  ");
            return -1;
        }
        else {
            Node temp = top ;
            top = top.next  ; // 34an anzl al top
            return temp.data ;

        }
    }

    //method to check if stack empty
    public boolean isEmpty(){
        return(top == null ) ;
    }



    // printing values in the Stack
    public void Display () {
        Node current = top ;

        while (current != null ) {
            System.out.print("{" + current.data + "}\t");
            current = current.next ;
        }
    }


    public int peek() {
        return top.data ;
    }

    // method to sort Stack using another Stack
    public Stack Sort (Stack stack ) {

        Stack tempStack = new Stack ();

        while(!(stack.isEmpty())) {

             // kda na 3mlt pop l2wl element 34an a7oto f temp
            int currentData = stack.pop();

            while(!(tempStack.isEmpty()) && tempStack.peek() > currentData ){
                //lw akbr harag3o al stack al adeem
                stack.push(tempStack.pop());
            }

            // lw as8ar ha7oto f temp ;
            tempStack.push(currentData);
            System.out.print("current : "+ currentData );
            System.out.println("");
        }

        return tempStack ;
    }



}
