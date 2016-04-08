package javaTest;

public class SleepAction implements Action{

	public static String callback;
	public static Result result;
	public SleepAction(String callback, Result result)
	{
		this.callback = callback;
		this.result = result;
	}
	@Override
	public void action() {
		System.out.println("it is sleeping!" + callback);
		result.result("sleeping");
	}

}
