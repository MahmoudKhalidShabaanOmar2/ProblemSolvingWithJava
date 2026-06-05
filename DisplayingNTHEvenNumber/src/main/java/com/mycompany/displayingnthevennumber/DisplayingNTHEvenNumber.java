/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingnthevennumber;

/**
 *
 * @author moka
 */
// Write A Java Program To Display The NTH Even Number =>
import java.util.Scanner;
public class DisplayingNTHEvenNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Integer Number Is = ");
        int IntegerNumber = input.nextInt();
        System.out.printf("The Integer Number Is = %d%n", IntegerNumber);
        int NTH = (IntegerNumber - 1) * 2;
        System.out.printf("The NTH Result Is = %d%n", NTH);
    }
}