package com.javaPrograms;

import java.util.LinkedHashSet;

public class CharacterPositionInGivenString {
public static void main(String[] args) {
	String s="india";
	LinkedHashSet<Character> str=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		str.add(s.charAt(i));
	}
	
	for(char ch:str)
	{
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i)) {
			System.out.println(ch+"="+(i+1));
			break;
			}
		}
	}
}
}
