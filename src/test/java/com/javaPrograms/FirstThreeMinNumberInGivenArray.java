package com.javaPrograms;

public class FirstThreeMinNumberInGivenArray {
public static void main(String[] args) {
	int array[]= {10,50,60,55,5};
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
	for(int res:array)
	{
		System.out.print(res+" ");
	}
	System.out.println();
	int sum=0;
	for(int k=0;k<3;k++)
	{
		sum=sum+array[k];
	}
	
	System.out.println("First Three Min Number In Given Array :"+" "+sum);
}
}
