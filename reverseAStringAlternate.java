package com.example7;

import java.util.Scanner;

public class reverseAStringAlternate {

    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);

        System.out.println("enter string to be reversed");
        String string1 = sc.next();

        StringBuilder sb = new StringBuilder(string1);  //create stringBuilder object

        System.out.println("the reversed string is : ");

        for (int i = sb.length()-1; i>=0; i--){ //this for loop traverses the string from back side
            System.out.print(sb.charAt(i));
        }
    }
}
