/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reversingtheorderofthestringsentence;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The String Sentence From The User , And Then 
// Reversing The Order Of The String Sentence By Using: toCharArray() =>
import java.util.Scanner;
import java.util.Arrays;
public class ReversingTheOrderOfTheStringSentence{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The String Sentence Is : ");
        String StringSentence = input.nextLine();
        System.out.printf("The String Sentence Is : %s%n", StringSentence);
        char[] ArrayOfCharactersFromStringSentence = StringSentence.toCharArray();
        System.out.printf("The Array Of Different Characters From The String Sentence Is : %s%n", Arrays.toString(ArrayOfCharactersFromStringSentence));
        String ReversingStringSentence = "";
        for(int i = ArrayOfCharactersFromStringSentence.length - 1 ; i >= 0 ; i--){
            ReversingStringSentence += ArrayOfCharactersFromStringSentence[i];
        }
        System.out.printf("The Reversing String Sentence Is : %s%n", ReversingStringSentence);
    }
}