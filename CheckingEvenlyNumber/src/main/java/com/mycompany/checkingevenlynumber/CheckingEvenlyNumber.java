/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkingevenlynumber;

/**
 *
 * @author moka
 */
// Write A Function To Get Two Integer Numbers From The User , 
// And Then Check If The Two Integer Numbers Can Be Divided Evenly =>
import java.util.Scanner;
public class CheckingEvenlyNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Number Is = ");
        int fristNumber = input.nextInt();
        System.out.printf("The Frist Number Is = %d%n",fristNumber);
        System.out.print("Please Enter The Second Number Is = ");
        int secondNumber = input.nextInt();
        System.out.printf("The Second Number Is = %d%n",secondNumber);
        if (fristNumber % secondNumber == 0){
            System.out.println("It Is Evenly Divided...");
        }
        else{
            System.out.println("It Is Not Evenly Divided...");
        }
    }
}