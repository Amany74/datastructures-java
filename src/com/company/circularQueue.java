package com.company;



public class circularQueue {
    int data;
    int front;
    int rear;
    int queue[];
    int size;

    public circularQueue(int size) {
        this.size = size;
        front = rear = -1;
    }


}