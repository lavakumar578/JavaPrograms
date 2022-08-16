package com.javaPrograms;

public class LeastStringInGivenArray {
public static void main(String[] args) {
	String array[]= {"welcome","hi","good","afternoon","all"};
	String max=array[0];
	for(int i=1;i<array.length;i++)
	{
		if(max.length()>array[i].length())
		{
			max=array[i];
		}
	}
	System.out.println(max);
	
}
}
