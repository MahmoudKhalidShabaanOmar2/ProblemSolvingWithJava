/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reformtheword;

/**
 *
 * @author moka
 */
// Write A Java Program To Get Two Parts Of The Same Word , And Then Finally 
// Reform The Word By Making The Frist Part Of The Same Word As A Capital Letter =>
import java.util.Scanner;
public class ReFormTheWord{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Frist Part From The Word Is : ");
        String FristPartFromWord = input.next();
        System.out.printf("The Frist Part From The Word Is : %s%n", FristPartFromWord);
        System.out.print("Please Enter The Second Part From The Word Is : ");
        String SecondPartFromWord = input.next();
        System.out.printf("The Second Part From The Word Is : ", SecondPartFromWord);
        String ReFormTheWord = FristPartFromWord.substring(0 , 1).toUpperCase() + FristPartFromWord.substring(1 , FristPartFromWord.length()) + SecondPartFromWord;
        System.out.printf("ReFormming The Word Is : %s%n", ReFormTheWord);
    }
}