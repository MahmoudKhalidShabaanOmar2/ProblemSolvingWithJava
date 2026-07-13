/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayinghowmanyvowelsinword;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A Word From The User , And Then 
// Counting The Vowel Letters In The Word => 
import java.util.Scanner;
public class DisplayingHowManyVowelsInWord{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Sentence Is : ");
        String word = input.next();
        System.out.printf("The Word Is : %s%n", word);
        int CountingVowelLettersInWord = 0;
        for(int i = 0 ; i < word.length() ; i++){
            if((word.charAt(i) == 'a') || (word.charAt(i) == 'A') || (word.charAt(i) == 'e') || (word.charAt(i) == 'E') || (word.charAt(i) == 'i') || (word.charAt(i) == 'I') || (word.charAt(i) == 'o') || (word.charAt(i) == 'O') || (word.charAt(i) == 'u') || (word.charAt(i) == 'U')){
                CountingVowelLettersInWord++;
            }
        }
        System.out.printf("The Counting Of The Vowel Letters In The Word Is = %d%n", CountingVowelLettersInWord);
    }
}