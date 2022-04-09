/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write an algorithm to find the sum of the prime numbers which have the digit 
 * '3' in between 0 to n (n should be less than 1,000,000).
 * For example, the sum of the prime numbers (with 3 digit) 
 * between 0 and n=100 is (3+ 13+ 23+ 31+ 37+ 43+ 53+ 73+ 83)= 359.
 * @author domin
 */
public class Week08_Lab {
    
    public static int findPrimes(int num){
        
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        
        int count,sum =0;
        String str = "";
        
        for(int i = 0; i <= num; i++){      
            boolean isPrime = true;
            count = 0;
            
            for(int j=2; j<= i/2; j++){           
                if(i %j == 0){
                    count++;
                    isPrime = false;
                    break;
                }                 
             }          
             if(isPrime){
                 str = Integer.toString(i); // converts int to string
                 
                 if(str.contains("3")){     // checks if string contains 3 digit
                    primeNumbers.add(i);    // adds the prime number containing 3 digit to an arraylist
                    sum = sum +i;           // adds the prime numbers to int sum
                 }      
             }                         
        }       
        System.out.println("Prime numbers with '3' -> " + primeNumbers);
        return sum;
    }

    
    
    public static void main(String[] args){
       
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        int num =scnr.nextInt();
        
        if(num < 1000000){
           System.out.println("Sum of prime numbers: " + findPrimes(num)); 
        }
        else
            System.out.println(num + " is too high");
         
        }
    }
    

