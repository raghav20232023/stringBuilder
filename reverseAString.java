package com.example7;

//problem statement
//given a string, reverse it

import java.util.Scanner;

public class reverseAString {

    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);

        System.out.println("enter string to be reversed");
        String string1 = sc.next();

        StringBuilder sb = new StringBuilder(string1);

        for (int i=0; i<sb.length()/2; i++){    //we run loop for half length of string only
            //as we are traversing the string from both front and back side

            //index variables :
            int front = i;
            int back = sb.length() - 1 - i; //index of back character wrt front character

            char frontChar = sb.charAt(front);  //front character
            char backChar = sb.charAt(back);    //back character

            //exchange front and back characters
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println("the reversed string is  : " + sb);

    }
}
