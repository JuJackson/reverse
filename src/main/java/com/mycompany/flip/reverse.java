/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flip;
import java.util.Scanner;
/**
 *
 * @author yahbo
 */
public class reverse {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Please input word.");
        String word = scan.next();
        String switched="";
        for (int letters = word.length() - 1; letters >= 0; letters--) {
            switched += word.charAt(letters);
            }
        System.out.println(switched); 
        }   
        
    }

