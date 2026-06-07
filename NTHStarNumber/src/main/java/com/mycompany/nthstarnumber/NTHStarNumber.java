/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nthstarnumber;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The Positive Integer Number From The User To Get
// The Total Star Number Depending On This Format Like: 6n * (n - 1) + 1 =>
import java.util.Scanner;
public class NTHStarNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Positive Integer Number To Get The Total Numbers Of Stars Is = ");
        int PositiveIntegerNumber = input.nextInt();
        System.out.printf("The Positive Integer Number Is = %d%n", PositiveIntegerNumber);
        int NTHStarNumber = 6 * PositiveIntegerNumber * (PositiveIntegerNumber - 1) + 1;
        if(PositiveIntegerNumber > 0){
            System.out.printf("The NTH Star Numbers Is = %d%n ", NTHStarNumber);
        }
        else{
            System.out.printf("There Is No Any NTH Star Number , Because The Integer Number Is = %d%n", PositiveIntegerNumber);
        }
    }
}