package com.javaPrograms;

public class PrintStringAddingOneByOne {
public static void main(String[] args) {
	String s="india";
	String add="";
	for(int i=0;i<s.length();i++)
	{
		add=add+s.charAt(i);
		System.out.println(add);
	}
}
}
