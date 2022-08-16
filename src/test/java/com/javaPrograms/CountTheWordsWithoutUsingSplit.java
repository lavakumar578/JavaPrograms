package com.javaPrograms;

import java.util.Scanner;

public class CountTheWordsWithoutUsingSplit {
public static void main(String[] args) {
	String s = "java is the programming language";
	Scanner scan = new Scanner(s);
	int wordNum = 1;
	while(scan.hasNext()){
	    String temp = scan.next();
	    System.out.println(temp+" ==>  "+wordNum);
	    wordNum++;
	}
}
}
