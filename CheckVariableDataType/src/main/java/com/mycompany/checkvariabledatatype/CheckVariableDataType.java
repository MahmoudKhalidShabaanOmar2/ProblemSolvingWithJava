/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkvariabledatatype;

/**
 *
 * @author moka
 */
// Write A Java Program To A Variable With Any Data Type , And Then Check 
// The Data Type Of The Variable =>
import java.util.Scanner;
public class CheckVariableDataType{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Check The Variable Data Type : \n");
        if(input.hasNextInt()){
            System.out.println("Integer...");
        }
        else if(input.hasNextFloat()){
            System.out.println("Float...");
        }
        else if(input.hasNextDouble()){
            System.out.println("Double...");
        }
        else if(input.hasNextBoolean()){
            System.out.println("Boolean");
        }
        else{
            String value = input.nextLine();
            if(value.length() == 1){
                System.out.println("Character");
            }
            else{
                System.out.println("String...");
            }
        }
    }
}