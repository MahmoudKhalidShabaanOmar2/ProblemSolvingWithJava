/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingtotalnumbersofwordsinsidesentence;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A Sentence From The User , And Then Displaying 
// The Total Numbers Of Words Inside The Sentence =>
import java.util.Scanner;
import java.util.Arrays;
public class DisplayingTotalNumbersOfWordsInsideSentence{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Sentence Is : ");
        String Sentence = input.nextLine();
        System.out.printf("The Sentence Is : %s%n", Sentence);
        String[] ArrayOfDifferentWordsInsideSentence = Sentence.trim().split("\\s");
        System.out.printf("The Array Of Different Words Inside The Sentence Is : %s%n", Arrays.toString(ArrayOfDifferentWordsInsideSentence));
        int LengthOfWordsInsideSentence = ArrayOfDifferentWordsInsideSentence.length;
        System.out.printf("The Total Numbers Of Words Inside The Sentence Is : %d%n", LengthOfWordsInsideSentence);
    }
}