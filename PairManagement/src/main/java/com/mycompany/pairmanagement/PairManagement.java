/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pairmanagement;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Number Of  Arguements From The Array , And Then 
// Return The Array Of The Two Arguements =>
import java.util.Scanner;
import java.util.Arrays;
public class PairManagement{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number Of Arguements Is = ");
        int NumberOfArguements = input.nextInt();
        System.out.printf("The Number Of Arguements Is = %d%n", NumberOfArguements);
        int[] ArrayOfArguements = new int[NumberOfArguements];
        for (int i = 0 ; i < NumberOfArguements ; i++){
            System.out.print("Please Enter The Arguement ("+ i+ ") Is : ");
            ArrayOfArguements[i] = input.nextInt();
//            System.out.print(ArrayOfArguements[i]);
        }
        System.out.printf("The Array Of Different Arguements Is : %s" ,Arrays.toString(ArrayOfArguements));
    }
}