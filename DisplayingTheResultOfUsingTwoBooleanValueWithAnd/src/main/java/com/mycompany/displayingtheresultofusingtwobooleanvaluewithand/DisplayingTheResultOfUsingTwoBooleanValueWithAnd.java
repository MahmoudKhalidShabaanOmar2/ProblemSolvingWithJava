/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingtheresultofusingtwobooleanvaluewithand;

/**
 *
 * @author moka
 */
// Write A Java Program To Display The Result Of The Two Boolean Value With And Operand =>
import java.util.Scanner;
public class DisplayingTheResultOfUsingTwoBooleanValueWithAnd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Boolean Value Is : ");
        boolean fristBoolean = input.nextBoolean();
        System.out.printf("The Frist Boolean Value Is : %b%n", fristBoolean);
        System.out.print("Please Enter The Second Boolean Value Is : ");
        boolean secondBoolean = input.nextBoolean();
        System.out.printf("The Second Boolean Value Is : %b%n", secondBoolean);
        System.out.println("The Result Of The Combination Between The Frist Boolean "
        + "Value , And The Second Boolean Value Is : "+(fristBoolean && secondBoolean)); 
    }
}