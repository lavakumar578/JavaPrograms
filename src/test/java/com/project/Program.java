package com.project;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Program {
	public static void main(String[] args)
	{
		        String s="Smitha S";
		        LinkedHashSet<Character> l=new LinkedHashSet<Character>();
		        for(int i=0;i<s.length();i++)
		        {
		            l.add(s.charAt(i));
		        }
		        for (Character s1 : l) {
		        {
		            int count=0;
		            for(int j=0;j<s.length();j++)
		            {
		                if(s1==s.charAt(j))
		                {
		                    count++;
		                }
		            }
		            System.out.println(s1+":"+count);
		        }	
	}
}
}
