/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.displayingprintfwithdifferentdatatypes;

/**
 *
 * @author moka
 */
public class DisplayingPrintFWithDifferentDataTypes{
    public static void main(String[] args){
        int x = 12;
        System.out.printf("Integer Is = %d%n", x);
        float y = 13.223f;
        System.out.printf("Float Is = %f%n", y);
        double z = 13132.2424242424;
        System.out.printf("Double Is = %f%n", z);
        char ch = 'A';
        System.out.printf("Character Is : %c%n", ch);
        String Str = "Hello World From Java...";
        System.out.printf("String Is : %s%n", Str);
        boolean boolt = true;
        System.out.printf("Boolean Is : %b%n", boolt);
        boolean boolf = false;
        System.out.printf("Boolean Is : %b%n", boolf);
        int IntegerHexadecimal = 255;
        System.out.printf("Integer Hexadecimal Is = ", IntegerHexadecimal);
        int IntegerOctal = 64;
        System.out.printf("The Integer Octal Is : %o%n", IntegerOctal);
    }
}