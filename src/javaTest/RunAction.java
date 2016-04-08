package javaTest;

public class RunAction implements Action {

	public static String callback;
	public static Result result;
	public RunAction(String callback, Result result)
	{
		this.callback = callback;
		this .result = result;
	}
	@Override
	public void action() {
		System.out.println("it is running!" + callback);
		result.result("running");
	}

}
