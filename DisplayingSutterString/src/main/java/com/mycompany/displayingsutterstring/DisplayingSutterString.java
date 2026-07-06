/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingsutterstring;

/**
 *
 * @author moka
 */
// Write a Java Program,  that stutters a word as if someone is struggling to read it. 
// The first two letters are repeated twice with an ellipsis ... and space after 
// , and then the word is pronounced with a question mark ?. =>
import java.util.Scanner;
public class DisplayingSutterString{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Word Is : ");
        String word = input.next();
        System.out.printf("The Word Is : %s%n", word);
        String FristTwoCharactersFromWord = word.substring(0 , 2);
        System.out.printf("The Frist Two Characters From The Word Is : %s%n", FristTwoCharactersFromWord);
        String SutterWord = FristTwoCharactersFromWord+"... "+FristTwoCharactersFromWord+"... "+word+"?";
        System.out.printf("The Sutter Word Is : %s%n", SutterWord);
    }
}