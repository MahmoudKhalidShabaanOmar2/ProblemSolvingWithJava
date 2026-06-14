/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkcaseinsensitivecompransion;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Two Words From The User , And Then Check 
// The Length Of The Two Words =>
import java.util.Scanner;
public class CheckCaseInSensitiveCompransion{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Word Is : ");
        String FristWord = input.next();
        System.out.printf("The Frist Word Is : %s%n", FristWord);
        int LengthOfFristWord = FristWord.length();
        System.out.printf("The Length Of The Frist Word Is = %d%n", LengthOfFristWord);
        System.out.print("Please Enter The Second Word Is : ");
        String SecondWord = input.next();
        System.out.printf("The Second Word Is : %s%n", SecondWord);
        int LengthOfSecondWord = SecondWord.length();
        System.out.printf("The Length Of The Second Word Is : %d%n", LengthOfSecondWord);
//        if(FristWord.length() == SecondWord.length()){
//            System.out.println("It Is TRUE... , Because It Is Matched Two Words...");
//        }
//        else{
//            System.out.println("It Is False... , Because It Is Not Matched Two Words...");
//        }
          if(LengthOfFristWord == LengthOfSecondWord){
              System.out.println("It Is TRUE... , Because It Is Matched Two Words...");
          }
          else{
              System.out.println("It Is FALSE... , Because It Is Not Matched Two Words...");
          }
    }
}