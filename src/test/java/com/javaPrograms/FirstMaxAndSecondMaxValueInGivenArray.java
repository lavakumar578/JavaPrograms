package com.javaPrograms;

public class FirstMaxAndSecondMaxValueInGivenArray {
public static void main(String[] args) {
	int array[]= {10,30,50,40,90,60};
	for(int i=0;i<array.length;i++)
	{
		for(int j=i+1;j<array.length;j++)
		{
			if(array[i]<array[j])
			{
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}	
	}
	System.out.println("First Max Number in given array is"+" "+array[0]);
	System.out.println("Second Max Number in given array is"+" "+array[1]);
}
}
