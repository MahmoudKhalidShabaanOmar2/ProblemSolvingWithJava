/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.isthewordsingularorplural;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A Word From The User , And Then Check If This Word 
// Is A Singluar , Or Plurar =>
import java.util.Scanner;
public class IsTheWordSingularOrPlural{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Word Is : ");
        String Word = input.next();
        System.out.printf("The Word Is : %s%n", Word);
//        if(Word.endsWith("s") || Word.endsWith("S")){
//            System.out.println("It Is TRUE...");
//        }
//        else{
//            System.out.println("It Is FALSE...");
//        }
          char LastCharacter = Word.charAt(Word.length() - 1);
          System.out.printf("The Last Character Is : %s%n", LastCharacter);
          if((LastCharacter == 'S') || (LastCharacter == 's')){
              System.out.println("It Is TRUE...");
          }
    }
}