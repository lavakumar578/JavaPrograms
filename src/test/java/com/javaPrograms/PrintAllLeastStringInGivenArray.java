package com.javaPrograms;

public class PrintAllLeastStringInGivenArray {
	public static void main(String[] args) {
		
	
	String array[]= {"hi","good","afternoon","to","all","here","is","javasession","moon"};
	String min=array[0];
	for(int i=0;i<array.length;i++)
	{
		if(min.length()>array[i].length())
		{
			min=array[i];
		}
	}
	System.out.println(min);
	for(int j=0;j<array.length;j++)
	{
		if(min.length()==array[j].length())
		{
			System.out.println(array[j]);
		}
	}
}
}