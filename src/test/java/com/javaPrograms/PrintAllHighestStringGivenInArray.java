package com.javaPrograms;

import java.util.Scanner;

public class PrintAllHighestStringGivenInArray {
public static void main(String[] args) {
	String array[]= {"hi","good","afternoon","to","all","here","is","javasession","moon"};
	String max=array[0];
	for(int i=0;i<array.length;i++)
	{
		if(max.length()<array[i].length())
		{
			max=array[i];
		}
	}
	System.out.println(max);
	for(int j=0;j<array.length;j++)
	{
		if(max.length()==array[j].length())
		{
			System.out.println(array[j]);
		}
	}
}
}
