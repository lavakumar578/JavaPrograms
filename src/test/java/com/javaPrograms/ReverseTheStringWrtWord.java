package com.javaPrograms;

import java.util.LinkedHashSet;

public class ReverseTheStringWrtWord {
public static void main(String[] args) {
	String s="welcome to india";
	String[] str = s.split(" ");
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	for(int i=0;i<str.length;i++)
	{
		set.add(str[i]);
	}
	for(String word:set)
	{
		String rev="";
		char[]ch=word.toCharArray();
		for (char c : ch) {
			rev=c+rev;
		}
		System.out.print(rev+" ");
	}
}
}
