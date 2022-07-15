package com.cactus.challenge;

import java.util.ArrayList;
import java.util.List;

/*
Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).

The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].

If a[i] > b[i], then Alice is awarded 1 point.
If a[i] < b[i], then Bob is awarded 1 point.
If a[i] = b[i], then neither person receives a point.
Comparison points is the total points a person earned.

Given a and b, determine their respective comparison points.

Example

a = [1, 2, 3]
b = [3, 2, 1]
For elements *0*, Bob is awarded a point because a[0] .
For the equal elements a[1] and b[1], no points are earned.
Finally, for elements 2, a[2] > b[2] so Alice receives a point.
The return array is [1, 1] with Alice's score first and Bob's second.

Sample Input 0
5 6 7
3 6 10

Sample Output 0
1 1

 */

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
