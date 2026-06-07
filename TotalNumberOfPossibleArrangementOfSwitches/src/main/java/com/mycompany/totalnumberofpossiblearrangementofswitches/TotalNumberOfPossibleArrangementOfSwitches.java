/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.totalnumberofpossiblearrangementofswitches;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Total Number Of The Possible Arrangement Of The 
// Switches (ON , And OFF) By Using This Formula Like 2 ^ Number And Given The 
// Number Of Switches From The User =>
import java.util.Scanner;
public class TotalNumberOfPossibleArrangementOfSwitches{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Total Number Of Switches Is = ");
        int NumberOfSwitches = input.nextInt();
        System.out.printf("The Number Of Switches Is = %d%n", NumberOfSwitches);
        double TotalNumberOfPossibleArrangement = Math.pow(2 , NumberOfSwitches);     
        System.out.println("The Total Number Of All Arrangements Is = "+TotalNumberOfPossibleArrangement);
        
    }
}