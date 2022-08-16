package com.javaPrograms;

public class ReverseWithOutUsingLength {
public static void main(String[] args) {
	String s="India";
	String rev="";
	char[]ch=s.toCharArray();
	for (char c : ch) {
		rev=c+rev;
	}
	System.out.println(rev);
}
}
