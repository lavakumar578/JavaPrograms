package com.project;

import java.util.Scanner;

public class RepeatedChars {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String sentence=s.nextLine();
	String s1=sentence;
	String str[]=s1.split(" ");
	for(int i=0;i<str.length;i++)
	{
		int count=0;
		for(int j=0;j<str.length;j++)
		{
			if(str[i].equals(str[j]) && i>j)
			{
				break;
			}
			if(str[i].equals(str[j]))
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println(str[i]+" has "+count+"times");
		}
	}
	
}
}
