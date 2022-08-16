package com.javaPrograms;

public class HighestStringInGivenArray {
public static void main(String[] args) {
	String array[]= {"hi","good","afternoon","to","all","here","is","javasession"};
	String max=array[0];
	for(int i=0;i<array.length;i++)
	{
		if(max.length()<array[i].length())
		{
			max=array[i];
		}
	}
	System.out.println(max);
}
}
