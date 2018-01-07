package com.Strings;
import java.io.*;
import java.util.*;

public class StringManipulation {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sizeA=A.length();
        int sizeB=B.length();
        System.out.println(sizeA+sizeB);
        
        int result=A.compareTo(B);
        if(result>0){
        	System.out.println("Yes");
        }
        else if(result<0){
        	System.out.println("No");
        }
        A = A.toLowerCase();
        A = Character.toString(A.charAt(0)).toUpperCase()+A.substring(1);
        
        B = B.toLowerCase();
        B = Character.toString(B.charAt(0)).toUpperCase()+B.substring(1);
        
        System.out.println(A+" "+B);
    }
}
