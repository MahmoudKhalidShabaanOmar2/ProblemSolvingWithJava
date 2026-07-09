/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reversingtheorderofastringsentence;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The String Sentence From The User , And Then 
// Displaying The Reversing Of The String Sentence By Using The For Loop Method =>
import java.util.Scanner;
public class ReversingTheOrderOfAStringSentence{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The String Sentence Is : ");
        String StringSentence = input.nextLine();
        System.out.printf("The String Sentence Is : %s%n", StringSentence);
        String ReversingStringSentence = "";
        for(int i = StringSentence.length() - 1 ; i >= 0 ; i--){
            ReversingStringSentence += StringSentence.charAt(i);
        }
        System.out.printf("The Reversing String Sentence Is : %s%n", ReversingStringSentence);
    }
}