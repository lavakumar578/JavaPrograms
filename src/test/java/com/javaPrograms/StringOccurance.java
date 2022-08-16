package com.javaPrograms;

import java.util.LinkedHashSet;

public class StringOccurance {
public static void main(String[] args) {
	String s="india";
	//step1:create a set collection and  add all the char to string i n d a
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	{
		for(int i=0;i<s.length();i++)
		{
				set.add(s.charAt(i));
		}
		//step2: compare  each char of set with all the char of given string
		for(char ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					//step3:if it is matching increment the count
					count++;
				}	
			}
			//step4: print both the char & count
			System.out.println(ch+"="+count);
		}
	}
}
}
