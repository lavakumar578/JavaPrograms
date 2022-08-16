package com.javaPrograms;

public class Assignment3 {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {4,5,6,7};
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i]+b[i];
		}
		
		for(int res:b)
		{
			System.out.print(res+" ");
		}
	}
}
