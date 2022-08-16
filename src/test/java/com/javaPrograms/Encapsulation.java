package com.javaPrograms;

public class Encapsulation {
	private int x=10;
	private int y=30;
	
	public void getData()
	{
		System.out.println(x);
	}
	private void getPrivateData()
	{
		System.out.println(y);
	}
	public void getPrivateData1()
	{
		getPrivateData();
	}
public static void main(String[] args) {
	Encapsulation e=new Encapsulation();
	e.getData();
	e.getPrivateData();
	
}
}