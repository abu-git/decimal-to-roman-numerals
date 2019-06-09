/*
	AUTHOR: Samuel Abu
	Task: Converting Decimal Numbers to Roman Numerals

	DESCRIPTION: The romanizer function/method takes an int array as 
	its argument returns a String array of the roman numerals of the
	numbers in the int array argument.


	PS: I was unable to complete the Task 7 in time. I think the timer is
	added pressure but what better way to test than to time us right?

	I figured it out a couple of minutes after the timer died(ran out).

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Take2
{
    static String[] romanizer(int[] numbers) 
    {
        String [] result = new String[numbers.length];
        String roman = "";
        int res = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            res = numbers[i];
			while(res > 999)
			{
				roman = roman + "M";
				res = res - 1000;
			}
			if(res > 899)
			{
				roman = roman + "CM";
				res = res - 900;
			}
			if(res > 499)
			{
				roman = roman + "D";
				res = res - 500;
			}
			if(res > 399)
			{
				roman = roman + "CD";
				res = res - 400;
			}
			while(res > 99)
			{
				roman = roman + "C";
				res = res - 100;
			}
			if(res > 89)
			{
				roman = roman + "XC";
				res = res - 90;
			}
			if(res > 49)
			{
				roman = roman + "L";
				res = res - 50;
			}
			if(res > 39)
			{
				roman = roman + "XL";
				res = res - 40;
			}
			while(res > 9)
			{
				roman = roman + "X";
				res = res - 10;
			}
			if(res > 8)
			{
				roman = roman + "IX";
				res = res - 9;
			}
			if(res > 4)
			{
				roman = roman + "V";
				res = res - 5;
			}
			if(res > 3)
			{
				roman = roman + "IV";
				res = res - 4;
			}
			while(res > 0)
			{
				roman = roman + "I";
				res = res - 1;
			}			             
	        result[i] = roman;
	        roman = "";
	        continue;
        }
        return result;
    }

    public static void main(String [] args)
    {
    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        String [] finall = romanizer(ar);
        for(int i = 0; i < n; i++){
            System.out.println(finall[i]);
        }

    }
}