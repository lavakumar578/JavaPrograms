package com.javaPrograms;

public class Assignment1 {
	public static void main(String[] args) {
		
	
	int array[]= {1,0,1,0,1,1,0};
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
}
	
}
