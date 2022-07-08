package com.cactus.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
- Given an array & chunk size, divide the array into many sub-arrays
    where each sub-array is of length size. Eg
    * chunk([1,2,3,4], 2) ==> [[1,2], [3,4]]
    * chunk([1,2,3,4,5], 2) ==> [[1,2], [3,4], [5]]
    * chunk([1,2,3,4,5,6,7,8], 3) ==> [[1,2,3], [4,5,6], [7,8]]

 */
public class Main {

    public static void main(String[] args) {
	// write your code her
        int[] arr = {1,2,3,4,5,6,7,8};
        for (int i: arr) {
            System.out.print(i + ",");
        }

        System.out.println(" ");

        chunk(arr, 4);
    }

    public static void chunk(int[] intArray, int chunkSize){
        List<int[]> chunked = new ArrayList<>();

        int i = 0;

        while(i < intArray.length){
            int[] out = Arrays.copyOfRange(intArray, i, Math.min(i + chunkSize, intArray.length));
            chunked.add(out);
            out = new int[chunkSize];
            i += chunkSize;
        }

        for(int[] subArray : chunked){
            System.out.print("[");
            Arrays.stream(subArray).forEach(x -> System.out.printf("%d,", x));
            System.out.print("]");
        }
    }

}
