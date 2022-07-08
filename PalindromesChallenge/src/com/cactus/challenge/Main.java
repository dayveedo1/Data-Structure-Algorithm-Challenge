package com.cactus.challenge;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(checkForPalindrome("Hello!"));
        System.out.println(checkForPalindrome("Racecar!"));
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("dave"));
        System.out.println(checkForPalindrome("abcdefggfedcba"));

    }

    public static boolean checkForPalindrome(String s){

        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();

        //StringBuilder str = new StringBuilder();

        String lowercase = s.toLowerCase();

        for (int i = 0; i < lowercase.length(); i++){
            char c = lowercase.charAt(i);
            if (c >= 'a' && c <= 'z'){
                //str.append(c);
                stack.push(c);
                queue.addLast(c);
            }
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()){
            reversed.append(stack.pop());
            return(reversed.toString().equals(queue.remove().toString()));
        }
        return false;
    }
}
