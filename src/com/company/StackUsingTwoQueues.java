package com.company;
import java.util.LinkedList;
import java.util.Queue;
public class StackUsingTwoQueues {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    StackUsingTwoQueues() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();

    }

    /*
    Push :
If queue1 is empty, add elements to queue1
If queue1 is not empty,
add all elements of queue1 to queue2 ,
add current element to queue1
 and copy all elements of queue2 to queue1.

Pop :
Simply remove element from queue1.
    */

    public void push(int data ) {
        if ((queue1.size())==0) queue1.add(data);

        else{
            int sizeq1 = queue1.size();
            // Copy elements of Queue1 to Queue2
            for(int i =0 ; i < sizeq1 ; i++ ) {
                queue2.add(queue1.remove());
            }
queue1.add(data);
            for(int j = 0 ; j < sizeq1  ; j++ ) {
                queue1.add(queue2.remove());
            }
        }


    }


    //popping an element in the Stack
    public int pop(){
        if(queue1.size()==0)
            System.out.println("Sorry queue is Empty ");
        return queue1.remove();
    }





}
