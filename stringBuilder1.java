package com.example7;

//problem statement
//basic operations on class stringBuilder
// we use stringBuilder class in place of strings because stringBuilder is faster than strings
// stringBuilder has all the existing methods that the strings class uses + additional
//functionality in the form of additional methods

import java.util.Scanner;

public class stringBuilder1 {

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter string : ");
        String s = sc.next();

        StringBuilder sb = new StringBuilder(s);    //creating a StringBuilder object and
        //putting its value equal to string s

        System.out.print("enter index at which you want to know which character exists : ");
        int index = sc.nextInt();
        System.out.println(sb.charAt(index));
        //prints character that exists at index "index" in the string

        System.out.print("enter index at which you want to change character");
        int index2 = sc.nextInt();

        System.out.print("enter new character");
        String string1 = sc.next();
        char char1 = string1.charAt(0);
        sb.setCharAt(index2,char1);
        //sets a particular character at a particular index in a String
        // takes arguments :
        //1. index at which new character needs to be set
        //2. new character to be set

        System.out.println("updated string is : "+sb);

        System.out.print("enter the character at which new character needs to be inserted : ");
        String string2 = sc.next();
        char char2 = string2.charAt(1);

        System.out.print("enter the index at which new character needs to be inserted : ");
        int index3 = sc.nextInt();

        sb.insert(index3, char2);   //.insert method with string builder is used to insert
        // a character at a given index

        System.out.print("enter starting index of range of characters to be deleted : ");
        int index4 = sc.nextInt();

        System.out.println("enter ending index of range of characters to be deleted : ");
        int index5 = sc.nextInt();

        sb.delete(index4, index5);
        //note in .delete method of StringBuilder the starting index is inclusive and the
        //ending index is non inclusive

        System.out.print("enter the string to be appended to string entered earlier : ");
        String string3 = sc.next();

        sb.append(string3); //.append method of stringBuilder class appends or adds
        // a string at the end of a given string
        // takes argument as string to be added (inside brackets)

        System.out.print("updated string is : " + sb);
        System.out.print("length of string is : "+ sb.length());
        //the length method also works with StringBuilder class





    }
}
