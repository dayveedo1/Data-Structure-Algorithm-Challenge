package com.cactus.challenge;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(isAnagram("HELLO!!!", "lleho% "));
        System.out.println(isAnagram("RACE", "care"));
        System.out.println(isAnagram("Kelvin", "David"));
    }

    public static boolean isAnagram(String x, String y){

        //convert to lowercase & remove the special characters in both strings
        String xlowerCase = x.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String ylowerCase = y.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int xLength = xlowerCase.length();
        int yLength = ylowerCase.length();

        // if both string length are equal
        if (xLength == yLength){

            //convert to character array
            char[] xArray = xlowerCase.toCharArray();
            char[] yArray = ylowerCase.toCharArray();

            //sort the array
            Arrays.sort(xArray);
            Arrays.sort(yArray);

            // equate both character arrays if the are both equal
            return Arrays.equals(xArray, yArray);

        }else {
            return false;
        }
    }
}
