package com.javaPrograms;

public class ArrayAscendingOrder {

	public static void main(String[] args) {
	int array[]= {50,20,40,30,10};
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
	}
	
}
