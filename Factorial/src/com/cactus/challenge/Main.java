package com.cactus.challenge;

import java.util.Arrays;

public class Main {

    /*
    Find the nth factorial using dynamic programming
     */

    public static void main(String[] args) {
	// write your code here

        factorial(20);
    }

    public static void factorial(int number){

        long[] arr = new long[number];

        arr[0] = 1;

        for (int i = 1; i < number; i++){
            arr[i] = arr[i - 1] * i;
        }

        for(long a : arr){
            System.out.println(a);
        }

        //Arrays.stream(arr).forEach(System.out::println);

    }
}
