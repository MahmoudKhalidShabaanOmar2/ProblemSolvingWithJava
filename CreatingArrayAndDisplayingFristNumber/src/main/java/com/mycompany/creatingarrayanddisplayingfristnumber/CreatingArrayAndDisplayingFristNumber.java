/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.creatingarrayanddisplayingfristnumber;

/**
 *
 * @author moka
 */
// Write A Java Program To Creating Array And Then Displaying The Frist Number From The Array =>
public class CreatingArrayAndDisplayingFristNumber{
    public static void main(String[] args){
        int[] ArrayOfNumbers = {10 , 15 , 20 , 25 , 30};
        System.out.println("The Array Of Different Numbers Is : ");
        for (int Nums : ArrayOfNumbers){
            System.out.println(Nums);
        }
        System.out.println("The Frist Number From The Array Is = "+ArrayOfNumbers[0]);
    }
}