/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conviencestore;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The Array Of Different Items , Change Will Always 
// Be Represented In Quarters , Dimes , Nikles , Pennies To Give The Due Total 
// Amount Of Money , Representing The Amount Of Change In The Pocket , To Get The
// Total Money Depends On Percentage For Each Person Like =>
// Quarters => 25%.
// Dimes => 10%.
// Nikles => 5%.
// Pennies => 1%.
// Then Returing True If The Total Money >= Due Monet Else Return False. =>
import java.util.Scanner;
public class ConvienceStore{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Quarters Is = ");
        int NumberOfQuarters = input.nextInt();
        System.out.printf("The Number Of Quarters Is = %d%n", NumberOfQuarters);
        System.out.print("Please Enter The Number Of Dimes Is = ");
        int NumberOfDimes = input.nextInt();
        System.out.printf("The Number Of Dimes Is = %d%n", NumberOfDimes);
        System.out.print("Please Enter The Number Of Nikles Is = ");
        int NumberOfNikles = input.nextInt();
        System.out.printf("The Number Of Nikles Is = %d%n", NumberOfNikles);
        System.out.print("Please Enter The Number Of Pennies Is = ");
        int NumberOfPennies = input.nextInt();
        System.out.printf("The Number Of Pennies Is = %d%n", NumberOfPennies);
        float TotalMoney = NumberOfQuarters * 0.25f + NumberOfDimes * 0.10f + NumberOfNikles * 0.05f + NumberOfPennies * 0.01f;
        System.out.printf("The Total Money Is = %f%n", TotalMoney);
        System.out.print("Please Enter The Due Money Is = ");
        float DueMoney = input.nextFloat();
        System.out.printf("The Due Money Is = %f%n", DueMoney);
        if(TotalMoney >= DueMoney){
            System.out.println("It Is TRUE...");
        }
        else{
            System.out.println("It Is FALSE...");
        }
    }
}