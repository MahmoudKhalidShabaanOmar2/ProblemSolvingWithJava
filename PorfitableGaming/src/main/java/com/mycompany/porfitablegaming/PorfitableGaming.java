/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.porfitablegaming;

/**
 *
 * @author moka
 */
// Write A Java Program To Take A Propability , Price , And Pay , And Finally 
// Return True If Probability * Price > Pay =>
import java.util.Scanner;
public class PorfitableGaming{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Probability Is = ");
        float Probability = input.nextFloat();
        System.out.printf("The Probability Is = %f%n", Probability);
        System.out.print("Please Enter The Price Is = ");
        int Price = input.nextInt();
        System.out.printf("The Price Is = %d%n", Price);
        System.out.print("Please Enter The Pay Is = ");
        int pay = input.nextInt();
        System.out.printf("The Pay Is = %d%n", pay);
        if ( Probability * Price > pay){
            System.out.println("It Is True , Because The Multiplication Of "
            + "The Probability , And Price Is = "+Probability * Price+" Is Grater Than The Pay");
        }
        else{
            System.out.println("It Is False , Because The Multiplication Of The "
            + "Probabilty , And Price Is = "+Probability * Price+" Is Less Than The Pay");
        }
    }
}