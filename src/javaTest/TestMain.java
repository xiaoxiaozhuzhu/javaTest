package javaTest;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TestMain {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, UnsupportedEncodingException
	{
//		Class<?> demo = null;
//		try {
//			demo = Class.forName("javaTest.SUB");
//			//获取类的构造函数信息
//			Constructor<?> cons[] = demo.getConstructors();
//			for (int i = 0; i < cons.length; i++) {
//				Class<?> p[] = cons[i].getParameterTypes();
//				
//				System.out.println("构造方法：");
//				int mod = cons[i].getModifiers();
//				String modifier = Modifier.toString(mod);
//				System.out.println(modifier + " " + cons[i].getName() + "(" );
//				for (int j = 0; j < p.length; j++) {
//					System.out.println(p[j].getName() + " args " + i);
//					if (j < p.length - 1) {
//						System.out.println(",");
//					}
//				}
//				System.out.println("){}");
//			}
//			
//			//通过反射调用类的方法
//			
//			Method method = demo.getMethod("getValue");
//			method.invoke(demo.newInstance());
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NoSuchMethodException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
//		List<String> list = new ArrayList<String>();
//		Map<Integer, List<String>> mapList = new HashMap<Integer, List<String>>();
//		mapList.put(1, list);
//		list.add("hello");
//		list.add("word");
//		
//		System.out.println(mapList.toString());
		
		
//		int num = 1329311872;
//		System.out.println("num: " + Integer.toBinaryString(num));
//		
////		int num1 = num << 2;
////		System.out.println("num1: " + Integer.toBinaryString(num1));
//		
//		int num2 = num >>6;
//		System.out.println("Binary num2： " + Integer.toBinaryString(num2));
//		System.out.println("int num2: " + num2);
		
//		runAction(1, new Action() {
//			
//			@Override
//			public void action() {
//				System.out.println("the inner action");
//			}
//		});
//		
//		runAction(2, new RunAction("running", new Result()));
//		runAction(3, new SleepAction("sleeping", new Result()));
//	//--------------------------------------------------	
//		String epid = "1234|123|789|333";
//		String[] appIdIndex = epid.split("\\|");
//		String appid = null;
//		int length = appIdIndex.length;
//		if (appIdIndex.length == 4) {
//			appid = appIdIndex[3];
//		}
////		String appid = epid.substring(appIdIndex, epid.length());
//		System.out.println(appid);
//		//----------------------------------------------------------
		
//		String str1 ="我**是*****一*****个*****教*****师";
//		String[] str2 = str1.split("\\*");
//		for (String string : str2) {
//			System.out.println(" \n"+string);
//		}
//		
//		StructTest test = new StructTest();
//		test.test = new StructStructTest();
//		processTest(test);
//		StructStructTest structtest = test.test;
//		System.out.println("the test time is: " + test.time +  "  the test string is: " + test.string + "  the structstruct timetime is: " +structtest.timetime);
//	    String sa = "123";
//	    String sb = "123";
//	    if (sa.equals(sb)) {
//			System.out.println("sa==sb");
//		}else{
//			
//		}
//		StructStructTest a = new StructStructTest();
//		StructStructTest b = new StructStructTest();
//	if (a.equals(b)) {
//		System.out.println("a==b");
//	} else {
//		System.out.println("a!=b");
//	}
		
//		String teststring = "xJgcAE%2BzYF9TAQAAD9tpX1MBAAAAAAAAAAAAAAAAAAAjMjNAODk4YWFlODRkNDc2ZmNjMTc3Y2Qw%0AOTUzMTlmNGRlYWQ%3D%0A";
//		
////		String string1 = URLDecoder.decode(teststring, "UTF-8");
//		String string1 = URLDecoder.decode(teststring);
//
//		
//		System.out.println("spring1 is : "+string1);
//		try {
//			SUB sub = null;
//			System.out.println(sub.getSuperValue());
//		} catch (Exception e) {
//			
//		}
		
//		stringTest(new String[] {"1","2","3","4","5"});
//		varStringTest("a","b","c","d");
		
		System.out.println(UUID.randomUUID().toString());

	}
	
	private static void stringTest(String[] args)
	{
		for (int i = 0; i < args.length; i++) {
			System.out.println(" "+ args[i] + "\n");
		}
	}
	
	private static void varStringTest(String ...files)
	{
		for (String string : files) {
			System.out.println(" "+ string + "\n");
		}
	}

	private static void processTest(StructTest test) {
		
		test.setString("string");
		test.setTime(111);
		StructStructTest teststruct = test.test;
		teststruct.setTime(22222222);
	}


	public static void runAction(int num, Action action)
	{
		System.out.println("the num is : " + num);
		action.action();
	}
}

