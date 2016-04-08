package javaTest;

public class Result {
	public static String end;
	public static void result(String end)
	{
		if (end.endsWith("running")) {
			System.out.println("the running end");
		}else if (end.endsWith("sleeping")) {
			System.out.println("the sleeping end");
		}else {
			System.out.println("the default end");
		}
	}
}
