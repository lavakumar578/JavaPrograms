package com.javaPrograms;

public class SumOfNumbersFromGivenString {
public static void main(String[] args) {
	String s="1%2S8^9#LT6";
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>='0'&&s.charAt(i)<='9')
		{
			int n=s.charAt(i)-48;  //48 is ascii value of 0
			System.out.println(n);
			sum=sum+n;
		}
	}
	System.out.println(sum);
}
}
