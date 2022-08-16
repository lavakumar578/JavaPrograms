package com.javaPrograms;

public class CombinationOfAlphaNumericSpecial {
public static void main(String[] args) {
	String s="n1%5l&n#8%7LI";
	String alpha="";
	String number="";
	String special="";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
		{
			alpha=alpha+ch;
		}
		else if(ch>='0'&&ch<='9')
		{
			number=number+ch;
		}
		else
		{
			special=special+ch;
		}
	}
	System.out.println(alpha);
	System.out.println(number);
	System.out.println(special);
}
}
