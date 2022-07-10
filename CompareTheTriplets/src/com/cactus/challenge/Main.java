package com.cactus.challenge;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Integer> aList = new ArrayList<>();
        aList.add(5);
        aList.add(6);
        aList.add(7);

        List<Integer> bList = new ArrayList<>();
        bList.add(3);
        bList.add(6);
        bList.add(2);


        System.out.println(compareTriplets(aList, bList));
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){

        //create variables to hold the score points
        int aPoints = 0;
        int bPoints = 0;

        //convert the list to array
        int[] aArray = new int[a.size()];
        for (int i = 0; i < a.size(); i++){
            aArray[i] = a.get(i);
        }

        int[] bArray = new int[b.size()];
        for (int i = 0; i < b.size(); i++){
            bArray[i] = b.get(i);
        }

        //create a list to push our score values into,
        // iterate 3 times to compare the values & score points
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            if (aArray[i] > bArray[i]){
                aPoints++;
            }

            if (aArray[i] < bArray[i]){
                bPoints++;
            }
        }
        // add our score values to list &  return list;
        scores.add(aPoints);
        scores.add(bPoints);
        return  scores;
    }
}
