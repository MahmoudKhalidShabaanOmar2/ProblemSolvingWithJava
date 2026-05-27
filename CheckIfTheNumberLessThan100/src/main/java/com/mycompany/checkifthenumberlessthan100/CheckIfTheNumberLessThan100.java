/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkifthenumberlessthan100;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The Number From The User , And Then Check If The Number Is Less Than 100 =>
import java.util.Scanner;
public class CheckIfTheNumberLessThan100{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Is = ");
        int number = input.nextInt();
        System.out.printf("The Number Is = %d", number);
        if(number < 100){
            System.out.printf("\nIt Is True.\nBecause Your Entered Number Is = %d ", number);
        }
        else{
            System.out.printf("\nIt Is False.\nBecause Your Entered Number Is = %d", number);
        }
    }
}