/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Write an algorithm to find the sum of the prime numbers which have the digit 
 * '3' in between 0 to n (n should be less than 1,000,000).
 * For example, the sum of the prime numbers (with 3 digit) 
 * between 0 and n=100 is (3+ 13+ 23+ 31+ 37+ 43+ 53+ 73+ 83)= 359.
 * @author domin
 */
public class Week08_Lab {
    
    public static int findPrimes(int start, int end){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int count,sum =0;
        for(int n = start; n <= end; n++){
            boolean prime = true;
            count = 0;
            
            for(int i=2; i<= n/2; i++){          
                if(n %i == 0){
                    count++;
                    prime = false;
                    break;
                }                 
             }
            
             if(prime){  
                 primes.add(n);   
             } 
             if(count==0 && n!=1){
                 sum = sum +n;
             }
        }
        System.out.println(primes);
        return sum;
    }

    
    
    public static void main(String[] args){
        int arr = findPrimes(1, 100);
        
        System.out.println(arr); 

       
        }
    }
    

