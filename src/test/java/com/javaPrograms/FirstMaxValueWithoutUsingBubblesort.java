package com.javaPrograms;

public class FirstMaxValueWithoutUsingBubblesort {
public static void main(String[] args) {
	int array[]= {20,10,50,60,40};
	int max=array[0];
	for(int i=1;i<array.length;i++)
	{
		if(max<array[i])
		{
			max=array[i];
		}
	}
	System.out.println(max);
			
	
}
}
