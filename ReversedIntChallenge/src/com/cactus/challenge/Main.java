package com.cactus.challenge;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(reversedInt(-987));
        System.out.println(reversedInt(-580));
        System.out.println(reversedInt(-1101));
    }

    public static int reversedInt(int n){

        LinkedList<Character> stack = new LinkedList<>();

        //Convert the input to string
        String number = Integer.toString(n);

        //get the length og the string
        int length = number.length();

        //iterate through the string & push each char to the stack array
        for(int i = 0; i < length; i++){
            char c = number.charAt(i);

            if (c >= '0' && c <= '9'){
                stack.push(c);
            }
        }

        //Rebuild the string using StringBuilder & pop the elements from the array & append back to the string-builder
        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }

        //if input is negative, we reverse input & mutliply by -1 to get negative reversed integer result of input
        //else just return reversed input as integer
        if (n < 0){
            return Integer.parseInt(reversed.toString()) * -1;
        }

        return Integer.parseInt(reversed.toString());

    }
}
