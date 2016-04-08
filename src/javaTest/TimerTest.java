package javaTest;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
	static class myTask extends TimerTask{

		@Override
		public void run() {
			System.out.println(new Date().toString() +": hello \n");
		}
		
	}

	public static void main(String[] args)
	{
		Timer timer = new Timer();

		timer.schedule(new myTask(), 100,2000);
		
	}
}
