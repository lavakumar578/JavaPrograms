package com.javaPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordInGivenString {
public static void main(String[] args) {
	String s="welcome to india india";
	String[] str = s.split(" ");
	LinkedHashSet<String> set=new LinkedHashSet<String>();
	for(int i=0;i<str.length;i++)
	{
		set.add(str[i]);
	}
	for(String word:set)
	{
		System.out.print(word+" ");
	}
}
}
