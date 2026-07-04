/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingtotalnumberofdigitsthatthegivennumberhas;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A Number From The User , And Then 
// Counting The Total Number Of Digits The Given Number Has =>
import java.util.Scanner;
public class DisplayingTotalNumberOfDigitsThatTheGivenNumberHas{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Is = ");
        int number = input.nextInt();
        System.out.printf("The Number Is = %d%n", number);
        int TotalNumberOfDigitsThatTheGivenNumberHas = 0;
        if(number == 0){
            TotalNumberOfDigitsThatTheGivenNumberHas = 0;
            System.out.printf("The Total Number Of Digits That The Given Number Has Is = %d%n", TotalNumberOfDigitsThatTheGivenNumberHas);
        }
        else{
            while(number > 0){
                number /= 10;
                TotalNumberOfDigitsThatTheGivenNumberHas++;
            }
            System.out.printf("The Total Number Of Digits That The Given Number Has = %d%n", TotalNumberOfDigitsThatTheGivenNumberHas);
        }
    }
}