package test;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;

public class Hlw {
	public static String lovePalindromes(String str) {
		String s=str.charAt(str.length()-1)+str;

        if(s.equals(str.charAt(str.length()-1)+str) && new StringBuffer(s).reverse().toString().equals(s))
        {

            return str.charAt(str.length()-1)+"";
        }
        else{

            return "Z";

        }  

    }

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        //INPUT [uncomment & modify if required]   

        String str = sc.next();

        

        //OUTPUT [uncomment & modify if required]

        System.out.println(lovePalindromes(str));

    }
}