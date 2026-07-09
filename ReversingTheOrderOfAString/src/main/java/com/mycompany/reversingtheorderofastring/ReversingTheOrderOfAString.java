/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reversingtheorderofastring;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A String Sentence From The User , And Then 
// Reversing The Order Of The String Sentence By Using StringBuilder Method =>
import java.util.Scanner;
public class ReversingTheOrderOfAString{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The String Sentence Is : ");
        String StringSentence = input.nextLine();
        System.out.printf("The String Sentence Is : %s%n", StringSentence);
        String ReversingSentence = new StringBuilder(StringSentence).reverse().toString();
        System.out.printf("The Reversing Of The String Sentence Is : %s%n", ReversingSentence);
    }
}