package javaTest;

public class SUB extends SUP{

	public SUB()
	{
		
	}
	
	public SUB(int args1, String args2)
	{
		System.out.println("args1=" + args1 +"args2=" + args2);
	}
	public int value = 1;
	public int getValue()
	{
		System.out.println("the value is:  " + value);
		return value;
	}
	public int getSuperValue()
	{
		System.out.print("the super value is: " + super.value);
		return super.value;
	}
}
