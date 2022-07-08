package com.cactus.challenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(reverseString("Cat"));
        System.out.println(reverseString("david"));
        System.out.println(reverseString("12345"));
        System.out.println(reverseString("Elephant"));
        System.out.println(reverseString("Jermaine"));
    }

    public static String reverseString(String s){

        //create a new LinkedList of type character
        LinkedList<Character> str =  new LinkedList<Character>();

        //iterate through the input & for each char in input, push into our linkedlist array
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            str.push(c);
        }

        //rebuild the string using StringBuilder & append the char popped out from linkedlist
        // then, return
        StringBuilder reversedString = new StringBuilder(str.size());
        while (!str.isEmpty()){
            reversedString.append(str.pop());
        }
        return reversedString.toString();

    }
}
