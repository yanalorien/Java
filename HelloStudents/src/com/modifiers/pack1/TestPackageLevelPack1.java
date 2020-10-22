package com.modifiers.pack1;

public class TestPackageLevelPack1
{
	public static void main(String[] args)
	{
		var p1 = new PackageLevel("Tony");
		var name = p1.getName();
		System.out.println(name);
	}
}
