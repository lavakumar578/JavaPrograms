package com.javaPrograms;

public class FirstMinAndSecondMinValueInGivenArray {
public static void main(String[] args) {
	int array[]= {10,50,4,80,100,15};
	for(int i=0;i<array.length;i++)
	{
		for(int j=i+1;j<array.length;j++)
		{
			if(array[i]>array[j])
			{
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
	System.out.println("First Min Number in given array is"+" "+array[0]);
	System.out.println("Second Min Number in given array is"+" "+array[1]);
}
}
