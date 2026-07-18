/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingsentencewithspacesbetweeneachcharacters;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A String Sentence From The User , And Then 
// Displaying The String Sentence With Spaces With Each Characters In Sentence 
// By Using Replace , And Trim() =>
import java.util.Scanner;
public class DisplayingSentenceWithSpacesBetweenEachCharacters{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The String Sentence Is : ");
        String StrSentence = input.nextLine();
        System.out.printf("The String Sentence Is : %s%n", StrSentence);
        String MakingASentenceWithSpacesBetweenEachCharactersInSentence = StrSentence.replace("", " ").trim();
        System.out.printf("The String Sentence With Spaces Between Each Characters Is : %s%n", MakingASentenceWithSpacesBetweenEachCharactersInSentence);
    }
}