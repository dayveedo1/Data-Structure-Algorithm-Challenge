package com.cactus.challenge;

/*
Write a function that accepts a string.
The function should capitalize the first letter of each word in the string,
then return the capitalized string.

Examples:

capitalize("a short sentence") => "A Short Sentence"
capitalize("a lazy fox") => "A Lazy Fox"
capitalize("look, it is working!") => "Look, It Is Working!"

 */


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println(capitalize("a lazy fox"));
        System.out.println(capitalize("a short trip!"));
        System.out.println(capitalize("Look, the is cake Brown"));

        System.out.println(capitalizeOption("look, is the cake Brown?"));
    }

    public static String capitalize(String s){

        //Convert input string to lowercase & split input string into array of word by using space regex ("\\s"). Eg: ["a", "lazy", "fox"]
        String sLowerCase = s.toLowerCase();
        String[] strSplit = sLowerCase.split("\\s");
        String strCap = "";

        //Create an new List to collect our output string
        List<String> strCapitalized = new ArrayList<>();

        //Iterate through the the split string array & for each word in array, convert the word to character array
        for(String word : strSplit){
            char[] ch = word.toCharArray();

            //Set the first character in the character array to Uppercase
            ch[0] = Character.toUpperCase(word.charAt(0));

            // convert the character array back to string & push string to the list
            strCap = String.copyValueOf(ch);
            strCapitalized.add(strCap);
        }
        //Join every word in the list to form our input string with the first Letter of each other capitalized
        return String.join(" ", strCapitalized);
    }

    public static String capitalizeOption(String s){

        //Get the first character from string
        String firstCharacter = Character.toString(s.charAt(0));

        //Use the StringBuilder class to construct our final output string with the first letter in the word capitalized
        StringBuilder bd = new StringBuilder();
        bd.append(firstCharacter.toUpperCase());

        //iterate through the string from the second character, compare the given character i with the previous character before it
        // if the character is a 'space', the we capitalize the current character selected & append to output string
        // else we just append the character to output string
        for (int i = 1; i < s.length(); i++){
            if(s.charAt(i - 1) == ' '){
                char c = Character.toUpperCase(s.charAt(i));
                bd.append(Character.toString(c));
            }else{
                bd.append(Character.toString(s.charAt(i)));
            }
        }

        //return out reconstructed string output
        return bd.toString();

    }
}
