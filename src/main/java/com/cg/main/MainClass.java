package com.cg.main;

import java.util.Arrays;
import java.util.List;

public class MainClass {
	public static void display(List<Integer >list)
	{
		long count=list.stream().count();
		System.out.println("the number of elements"+count);
	}
	public static void main(String args[])
	{
		display(Arrays.asList(12,34,5,45,3332,3,545));
	}
}
