/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.findingdiscountonproduct;

/**
 *
 * @author moka
 */
// Write A Java Program To Find The Disount Of The Product , Dependence On 
// The Given Original Price , And The Discount Percentage =>
import java.util.Scanner;
public class FindingDiscountOnProduct{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Original Price Of The Product Is : ");
        float OriginalProductPrice = input.nextFloat();
        System.out.printf("The Original Product Price Is : %f%n", OriginalProductPrice);
        System.out.print("Please Enter The Discount Percentage Is : ");
        float DiscountPercentage = input.nextFloat();
        System.out.printf("The Discount Percentage Is : %f%n", DiscountPercentage);
        float DiscountForProduct = OriginalProductPrice * DiscountPercentage / 100;
        System.out.printf("The Discount For The Product Is = %f%n", DiscountForProduct);
        float ProductPriceAfterDiscount = OriginalProductPrice - DiscountForProduct;
        System.out.printf("The Product Price After Discount Is = %f%n", ProductPriceAfterDiscount);
    }
}