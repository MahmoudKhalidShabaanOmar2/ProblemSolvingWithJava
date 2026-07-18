/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.spacebetweeneachcharactersinsentence;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A String Sentence From The User , And Then 
// Returning A Space With Different Characters Of String Sentence =>
// By Using For Loop () And charAt() =>
import java.util.Scanner;
public class SpaceBetweenEachCharactersInSentence{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The String Sentence Is : ");
        String StrSentence = input.nextLine();
        System.out.printf("The String Sentence Is : %s%n", StrSentence);
        System.out.print("The String Sentence With Spaces Between Each Characters In Sentence Is : ");
        for(int i = 0 ; i < StrSentence.length() ; i++){
            System.out.print(StrSentence.charAt(i)+" ");
        }
    }
}