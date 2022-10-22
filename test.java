package com.first.programme.in;

public class Test {

	public static void main(String[] args) {
		int n=7;

for (int i=0;i<n;i++)
{

	for (int j=0;j<n;j++)
	{
		if((j==0 )|| 
				i==0&&j<n-1
				|| j==n-1&& i>=1 && i<n/2|| 
				i==n/2 &&j!=n-1 || i==j && j>=n/2)
		{
		System.out.print("*");
		}
	else 
	{
		System.out.print(" ");

}
}
	for (int j=0;j<n;j++) {
		System.out.print(" ");
	}	//letter A

for (int j=0;j<n;j++){
if (i==0&& j>0 && j<n-1|| j==0&& i>0 || j==n-1&&i>0 || i==n/2)	
{
	System.out.print("*");
}
else
{
System.out.print(" ");
}
}
for (int j=0;j<n;j++) {
	System.out.print(" ");
}	
 //letter H
for (int j=0;j<n;j++){
if (j==0 || i==n/2 || j==n-1)	
{
	System.out.print("*");
}
else
{
System.out.print(" ");
}
}
for (int j=0;j<n;j++) {
	System.out.print(" ");
	
}	
	//Letter U
for (int j=0;j<n;j++){
if (j==0 && i<n-1 || i==n-1&& j>0 && j<n-1 || j==n-1&& i<n-1)	
{
	System.out.print("*");
}
else
{
System.out.print(" ");
}
}	
for (int j=0;j<n;j++) {
	System.out.print(" ");
}	
//Letter L
for (int j=0;j<n;j++){
if (j==0 || i==n-1)	
{
	System.out.print("*");
}
else
{
System.out.print(" ");
}
	}
	System.out.println();
}
}}
