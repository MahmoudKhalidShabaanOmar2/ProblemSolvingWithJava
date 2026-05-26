/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checktwonumbersequality;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Two Numbers From The User , And Then Check Equality =>
import java.util.Scanner;
public class CheckTwoNumbersEquality{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Number Is = ");
        float fristNumber = input.nextFloat();
        System.out.print("Please Enter The Second Number Is = ");
        float secondNumber = input.nextFloat();
        System.out.printf("\nThe Frist Number Is = %f",fristNumber);
        System.out.printf("\nThe Second Number Is = %f",secondNumber);
        if(fristNumber == secondNumber){
            System.out.println("\nIt Is True , Because The Frist Number Is Equal To Second Number.");
        }
        else{
            System.out.println("\nIt Is False , Because The Frist Number Is Not Equal To Second Number.");
        }
        
    }
}