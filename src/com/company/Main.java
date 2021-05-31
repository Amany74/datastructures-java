package com.company ;


import java.util.Arrays;

public class Main {

public static  void sort(int arr []){
    int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
            if (arr[j] > arr[j+1])
    {
        // swap temp and arr[i]
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }
}

    public static void main(String[] args) {

        int array [] = {90,70,80,20,30,20,10};

Algorithms i = new Algorithms();

int arr[] = {10 , 50 , 90,100,122,132,1,2,3};
sort(arr);
        System.out.println(Arrays.toString(arr));














    }}