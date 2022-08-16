package com.javaPrograms;

public class FirstMinValueWithoutUsingBubblesort {
	public static void main(String[] args) {
		int array[]= {20,10,50,60,40};
		int min=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(min>array[i])
			{
				min=array[i];
			}
		}
		System.out.println(min);
				
		
	}
}
