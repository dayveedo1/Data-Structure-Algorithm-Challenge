package com.cactus.challenge;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(maxChar("11199001111"));
    }

    public static char maxChar(String s){
        final int n = 256;
        int[] counter = new int[n];
        int length = s.length();

        for (int i = 0; i < length; i++){
            counter[s.charAt(i)]++;
        }

        int max = -1;
        char result = ' ';

        for (int i = 0; i < length; i++){
            if (max < counter[s.charAt(i)]){
                max = counter[s.charAt(i)];
                result = s.charAt(i);
            }
        }

        return result;
    }


//    public static char maxChar(String s){
//        final int n = 256;
//        int[] counter = new int[n];
//        int length = s.length();
//
//        for (int i = 0; i < length; i++){
//            counter[s.charAt(i)]++;
//        }
//
//        int max = -1;
//        char result = ' ';
//
//        for (int i = 0; i < length; i++){
//            if (max < counter[s.charAt(i)]){
//                max = counter[s.charAt(i)];
//                result = s.charAt(i);
//            }
//        }
//        return result;
//
//    }



}
