/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkingifstringemptyornot;

/**
 *
 * @author moka
 */
// Write A Java Program To Get String From The User , And Then 
// Check If The String Is Empty Or Not Empty =>
import java.util.Scanner;
public class CheckingIfStringEmptyOrNot{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The String Text Is : ");
        String Str = input.nextLine();
        System.out.println("The String Text Is : "+ Str);
        if(Str.isEmpty()){
            System.out.println("It Is Empty String...");
        }
        else{
            System.out.println("It Is Not Empty String...");
        }
    }
}