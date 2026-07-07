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
        System.out.print("Please Enter The String Word Is : ");
        String StringWord = input.next();
        System.out.printf("The String Word Is : %s%n", StringWord);
        String FristTwoCharactersFromWord = StringWord.substring(0 , 2);
        System.out.printf("The Frist Two Characters From The Word Is : %s%n", FristTwoCharactersFromWord);
        String SutterStringWord = FristTwoCharactersFromWord+"... "+FristTwoCharactersFromWord+"... "+StringWord+"?";
        System.out.printf("The Sutter String Word Is : %s%n", SutterStringWord);
    }
}