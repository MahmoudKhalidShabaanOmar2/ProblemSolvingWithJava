/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingtotalnumbersofcups;

/**
 *
 * @author moka
 */
// Write A Java Program To Get The Total Number Of Cups Of Coffe =>
import java.util.Scanner;
public class DisplayingTotalNumbersOfCups{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Cups Is = ");
        int NumberOfCups = input.nextInt();
        System.out.printf("The Total Number Of Cups Is = %d%n", NumberOfCups);
        int TotalNumberOfCupsOfCoffe = NumberOfCups + (NumberOfCups / 6);
        System.out.printf("The Total Number Of Cups Coffe Is = %d%n", TotalNumberOfCupsOfCoffe);
    }
}