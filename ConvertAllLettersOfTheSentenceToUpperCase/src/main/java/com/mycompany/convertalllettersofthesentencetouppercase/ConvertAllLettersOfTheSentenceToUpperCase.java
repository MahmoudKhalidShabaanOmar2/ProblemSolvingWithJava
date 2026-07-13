/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.convertalllettersofthesentencetouppercase;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Sentence From The User , And Then Convert All 
// Letters In The Sentence Into UpperCase =>
import java.util.Scanner;
public class ConvertAllLettersOfTheSentenceToUpperCase{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Sentence Is : ");
        String Sentence = input.nextLine();
        System.out.printf("The Sentence Is : %s%n", Sentence);
        String SentenceInUpperCase = Sentence.toUpperCase();
        System.out.printf("The Sentence Into UpperCase Is : %s%n", SentenceInUpperCase);
    }
}