/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingintegerinrange;

/**
 *
 * @author moka
 */
// Write A Java Program To Display An Integer Number In Range , Wether A Number 
// N Is Within The Lower Number , And The Upper Number =>
import java.util.Scanner;
public class DisplayingIntegerInRange{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Lower Number Is = ");
        int LowerNumber = input.nextInt();
        System.out.printf("The Lower Number Is = %d%n", LowerNumber);
        System.out.print("Please Enter The Number In Range Is = ");
        int NumberInRange = input.nextInt();
        System.out.printf("The Number In The Range Is = %d%n", NumberInRange);
        System.out.print("Please Enter The Upper Number Is = ");
        int UpperNumber = input.nextInt();
        System.out.printf("The Upper Number Is = %d%n", UpperNumber);
        if((NumberInRange >= LowerNumber) && (NumberInRange < UpperNumber)){
            System.out.println("It Is True , Because The Number In Range Between "
            + "The Lower Number , And The Upper Number");
        }
        else{
            System.out.println("It Is False , Because The Number In Range Is Not "
            + "In Range Between The Lower Number , And The Upper Number");
        }
    }
}