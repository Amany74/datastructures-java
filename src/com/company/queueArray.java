package com.company;

public class queueArray {
     int size ;
    int queueArr[] ;
    int front ;
    int rear ;
    int currentSize ;

    //constructor to sey size front and rear and queue .
    public queueArray (int sizeOfQueue) {
       this.size = sizeOfQueue ;
        front = 0 ;
        rear = -1 ;
        queueArr = new int[this.size ] ;
    }

// adding an element in the queue
    // el rear == queue f7alt lw feh 3onsor wa7d f array
    public void enQueue(int data ) {
if (isFull()) {
    System.out.println("Sorry Queue  is Full");

}
else {
    rear++;
    if (rear == size - 1) {
        rear = 0;
    }
    queueArr[rear] = data;
    currentSize++;
}
    }

// method to pop awl wa7d da5al
    public void deQueue(){
if (isEmpty()) {
    System.out.println("Queue is empty!! Can not dequeue element");
}
else {

    if(front == size - 1 ) {
        System.out.println(queueArr[front ] + " : removed from the queue");
        front = 0;
    }
else {
        System.out.println(queueArr[front] + " removed from the queue");
    }
    front++ ;
currentSize -- ;
}
    }

    
// check if queue is Empty

    public boolean isEmpty() {

        return (currentSize == 0) ;

        }

//check if queue is full .
    public boolean isFull(){
        return (size == currentSize ) ;
    }




}
