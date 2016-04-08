package javaTest;

import java.util.HashSet;
import java.util.Set;


public class HashSetTest {

	
	
	public static void main(String[] args)
	{
		Set<String> lists = new HashSet<String>();
		lists.add("1");
		lists.add("2");
		lists.add("1");
		 for (String string : lists) {
			 System.out.println("  :" + string + "\n");
		}
	}
}
