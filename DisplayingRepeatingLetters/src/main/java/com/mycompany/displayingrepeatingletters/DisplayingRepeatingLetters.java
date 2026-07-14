/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingrepeatingletters;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A Word From The User , And Then Displaying
// Repeating Sentence =>
import java.util.Scanner;
public class DisplayingRepeatingLetters{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Word Is : ");
        String word = "arachnophobia";
        System.out.printf("The Word Is : %s%n", word);
        String RepeatedWordLetters = "";
        for(int i = 0 ; i < word.length() ; i++){
            RepeatedWordLetters += word.charAt(i);
            RepeatedWordLetters += word.charAt(i);
        }
        System.out.printf("The Repeated Word Letters Is : %s%n", RepeatedWordLetters);
        System.out.println(word.endsWith("phobia"));
        System.out.println(word.getClass().getSimpleName());
    }
}