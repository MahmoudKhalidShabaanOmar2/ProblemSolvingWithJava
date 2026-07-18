/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.spacebetweendifferentcharactersinastringsentence;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A String Sentence From The User , And Then 
// Returning The Sentence With Spaces With Different Characters By Using 
// StringBuilder() , Append() , And Finally CharAt() =>
import java.util.Scanner;
public class SpaceBetweenDifferentCharactersInAStringSentence{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The String Sentence Is : ");
        String StrSentence = input.nextLine();
        System.out.printf("The String Sentence Is : %s%n", StrSentence);
        StringBuilder MakingSpacesBetweenDifferentCharactersInSentence = new StringBuilder();
        for(int i = 0 ; i < StrSentence.length() ; i++){
            MakingSpacesBetweenDifferentCharactersInSentence.append(StrSentence.charAt(i));
            if(i != StrSentence.length() - 1){
                MakingSpacesBetweenDifferentCharactersInSentence.append(" ");
            }
        }
        System.out.print("The String Sentence With Spaces Between Different Characters Is : ");
        System.out.print(MakingSpacesBetweenDifferentCharactersInSentence.toString());
    }
}