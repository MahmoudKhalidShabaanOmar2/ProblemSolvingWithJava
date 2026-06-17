/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.amazingedabit;

/**
 *
 * @author moka
 */
// Write A Java Program To Get A String Text From The User , And Then Check If 
// The String Text Contains "Edabit" Then Return Amazing , Else Return Not Amazing =>
import java.util.Scanner;
public class AmazingEdabit{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The String Text Is : ");
        String StringText = input.nextLine();
        System.out.printf("The String Text Is : %s%n", StringText);
        if((StringText.contains("Edabit")) || (StringText.contains("edabit"))){
            System.out.println(StringText);
        }
        else{
            StringText = StringText.replace("Amazing" , "Not Amazing");
            StringText = StringText.replace("amazing" , "not amazing");
            System.out.print(StringText);
        }
    }
}