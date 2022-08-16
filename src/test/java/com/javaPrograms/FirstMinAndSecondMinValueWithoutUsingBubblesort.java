package com.javaPrograms;

public class FirstMinAndSecondMinValueWithoutUsingBubblesort {
	public static void main(String[] args) {
		int array[]= {20,10,50,60,40,55,52};
		int Fmin=array[0];
		int Smin=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(Fmin>array[i])
			{
				Smin=Fmin;
				Fmin=array[i];
			}
			else if(Smin>array[i])
			{
				Smin=array[i];
			}
		}
		System.out.println(Fmin+"   "+Smin);
				
		
	}
}
