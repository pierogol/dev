package fizzBuzzSolutions;

import java.util.Hashtable;
import java.util.stream.IntStream;

/**
 * Created by Mostafa golmohammadi on 2/22/2019.
 * 
 * @author Mostafa
 * 
 */
public class TestFizzBuzz {

	public static void main(String[] args) {
		
		System.out.println("\nsolution1:");
		solution1();
		System.out.println("\nsolution2:");
		solution2();
		System.out.println("\nsolution3:");
		solution3();
		System.out.println("\nsolution4:");
		solution4();
		System.out.println("\nsolution5:");
		solution5();
		System.out.println("\nsolution6:");
		solution6();

	}
	private static void solution1() {
		final Hashtable<Integer, String> ht = new Hashtable<>(8);
		ht.put(0, "FizzBuzz");
		ht.put(3, "Fizz");
		ht.put(5, "Buzz");
		ht.put(6, "Fizz");
		ht.put(9, "Fizz");
		ht.put(10, "Buzz");
		ht.put(12, "Buzz");
		final StringBuilder sb = new StringBuilder();
		long startTime = System.nanoTime();
		for (int i = 0; i <= 100; i++) {
			final String s = ht.get(i % 15);
			if (null == s) {
				sb.append(i + " , ");
			} else {
				sb.append(s + " , ");
			}
		}
		System.out.print(sb.toString());
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000; // divide by 1000000 to get milliseconds.
		System.out.println("\nsolution1 duration : " + duration + "." + (endTime - startTime) % 1000000 + " milliseconds");

	}
	
	private static void solution2() {
		int n = 100;
		long startTime = System.nanoTime();
		for (int i = 0; i <= n; i++) {
			if (i % 15 == 0)
				System.out.print("FizzBuzz");
			else if (i % 5 == 0) {
				System.out.print("Buzz");
			} else if (i % 3 == 0) {
				System.out.print("Fizz");
			} else {
				System.out.print(i);
			}
			System.out.print(" , ");
		}
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000;
		System.out.println("\nsolution2 duration : " + duration + "." + (endTime - startTime) % 1000000 + " milliseconds");
	}
	
	private static void solution3() {
		long startTime = System.nanoTime();
		for (int i = 0; i <= 100; i++) {
			String value;
			switch (i % 15) {
			case 3:
			case 6:
			case 9:
			case 12: 
				value = "Fizz";
				break;
			case 5:
			case 10: 
				value = "Buzz";
				break;
			case 0: 
				value = "FizzBuzz";
				break;
			default: 
				value = Integer.toString(i);
			}
			System.out.print(value);
			System.out.print(" , ");
		}
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000;
		System.out.println("\nsolution3 duration : " + duration + "." + (endTime - startTime) % 1000000 + " milliseconds");
	}
	

	
	private static void solution4() {
		boolean flag = true;
		long startTime = System.nanoTime();

		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.print("Fizz");
				flag = false;
			}

			if (i % 5 == 0) {
				System.out.print("Buzz");
				flag = false;
			}

			if (flag) {
				System.out.print(i);
			}
			System.out.print(" , ");
			flag = true;
		}
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000;
		System.out.println("\nsolution4 duration : " + duration + "." + (endTime - startTime) % 1000000 + " milliseconds");
	}
	
	private static void solution5() {
		long startTime = System.nanoTime();

		IntStream.rangeClosed(0, 100).mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" + " , " : "Fizz" + " , ")
				: (i % 5 == 0 ? "Buzz" + " , " : i + " , ")).forEach(System.out::print);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000;
		System.out.println("\nsolution5 duration : " + duration + "." + (endTime - startTime) % 1000000 + " milliseconds");
	}
	
	private static void solution6() {
		long startTime = System.nanoTime();
		IntStream.rangeClosed(0, 100).forEach(i -> {
			StringBuffer bfr = new StringBuffer();
			if (i % 3 == 0)
				bfr.append("Fizz");
			if (i % 5 == 0)
				bfr.append("Buzz");
			if (i % 3 != 0 && i % 5 != 0)
				bfr.append(i);

			System.out.print(bfr.toString());
			System.out.print(" , ");
		});
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000; 
		System.out.println("\nsolution6 duration : " + duration + "." + (endTime - startTime) % 1000000 + " milliseconds");
	}


}
