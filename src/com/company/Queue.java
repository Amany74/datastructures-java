package com.company;

// class to define linked Node
class Node {
    int data ;
    Node next ;
}

public class Queue {



    // class memebers
    Node front ;
    Node rear ;
    int currentSize ;

   public Queue () {
       front = null;
       rear = null ;
       currentSize = 0 ;
   }

   // add data to the queue
    public void enQueue (int value ){
       Node oldrear = rear ;
       // we created the Node w samenaha rear bs m3mlnlha4 linking fl list
       rear = new Node ();
       rear.data = value ;
       rear.next = null ;

       if(isEmpty()) {
           front = rear ;
       }
       else{
           oldrear.next = rear ;
       }
       currentSize++ ;
   }

// method to display and remove the frist element entered the queue
public int deQueue () {
     int value = front.data ;
     front = front.next ; // 5las kda hna 8yrt al address ale kan f front
     if(isEmpty() )
         rear = null ;
     currentSize -- ;
    System.out.println(" ");
    System.out.print("element removed from the Queue : " + value );
     return value ;
}






// method to check if queue is Empty
    public boolean isEmpty(){
       return (currentSize == 0);
    }








}
