package com.cactus.challenge;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(81));
        //System.out.println(fizzBuzz(100));
    }

    public static int fizzBuzz(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
        return 0;
    }
}