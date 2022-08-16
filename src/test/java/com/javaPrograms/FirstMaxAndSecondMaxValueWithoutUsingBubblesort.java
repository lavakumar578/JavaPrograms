package com.javaPrograms;

public class FirstMaxAndSecondMaxValueWithoutUsingBubblesort {
	public static void main(String[] args) {
		int array[]= {20,10,50,60,40,55,52};
		int Fmax=array[0];
		int Smax=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(Fmax<array[i])
			{
				Smax=Fmax;
				Fmax=array[i];
			}
			else if(Smax<array[i])
			{
				Smax=array[i];
			}
		}
		System.out.println(Fmax+"   "+Smax);
				
		
	}
}
