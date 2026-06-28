/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayinghowmanydsarethere;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A Sentence From The User , And Then Displaying 
// The Numbers Of D's In Sentence =>
import java.util.Scanner;
public class DisplayingHowManyDsAreThere{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The String Sentence Is : ");
        String Sentence = input.nextLine();
        System.out.printf("The String Sentence Is : %s%n", Sentence);
        int LengthOfDsAreThere = 0;
        for(int i=0 ; i < Sentence.length() ; i++){
            if((Sentence.charAt(i) == 'D') || (Sentence.charAt(i) == 'd')){
                LengthOfDsAreThere += 1;
            }
        }
        System.out.printf("The Length Of D\'S In The Sentence Is = %d%n", LengthOfDsAreThere);
    }
}