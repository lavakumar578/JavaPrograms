package com.javaPrograms;

public class FirstThreeMaxNumberInGivenArray {
public static void main(String[] args) {
	int array[]= {10,50,60,70,30,5};
	int sum=0;
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
	for(int res:array)
	{
		System.out.print(res+" ");
	}
	System.out.println();
	for(int k=0;k<3;k++)
	{
		sum=sum+array[k];
	}
	System.out.println("First Three Max Number In Given Array :"+" "+sum);
	
	int s=0;
//	System.out.print(array.length-1);
//	System.out.print(array.length-3);
	for(int l=array.length-1;l>=array.length-3;l--)
	{
		s=s+array[l];
	}
	
	System.out.println(s);
	
}
}
