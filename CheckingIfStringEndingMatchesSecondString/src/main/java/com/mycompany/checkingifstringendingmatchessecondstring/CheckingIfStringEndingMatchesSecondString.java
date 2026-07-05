/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkingifstringendingmatchessecondstring;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Two Strings From The User , And Then Checking 
// If The Frist String Ending Matches With The Second String =>
import java.util.Scanner;
public class CheckingIfStringEndingMatchesSecondString{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Sentence Is : ");
        String FristSentence = input.nextLine();
        System.out.printf("The Frist Sentence Is : %s%n", FristSentence);
        System.out.print("Please Enter The Second Sentence Is : ");
        String SecondSentence = input.nextLine();
        System.out.printf("The Second Sentence Is : %s%n", SecondSentence);
        if(FristSentence.endsWith(SecondSentence)){
            System.out.print("It Is TRUE , Because The Frist String Ending Matches The Second String...");
        }
        else{
            System.out.print("It Is FALSE , Because The Frist String Ending Not Matches The Second String...");
        }
    }
}