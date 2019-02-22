package printStars;


/**
 * Created by Mostafa golmohammadi on 2/22/2019.
 * 
 * @author Mostafa
 * 
 */


public class StarTest {
	public static void main(String[] args) {
		
		System.out.println("\nsolution1:\n");
		solution1();
		System.out.println("\nsolution2:\n");
		solution2(5);
		System.out.println("\nsolution3:\n");
		solution3();
		System.out.println("\nsolution4:\n");
		solution4();
		
	}
	
	private static void solution1() {
		String s = "";

		for (int i = 1; i <= 5; ++i) {
			s += "*";
			System.out.println(s);
		}
	}

	public static String solution2(int count) {

		if (count <= 0) {
			return "";
		}
		String p = solution2(count - 1);
		p = p + "*";
		System.out.println(p);
		return p;
	}

	private static void solution3() {
		int i, j;

		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void solution4() {
		int rows = 5, i = 1, j = 1;

		while (i <= rows) {
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.print("\n");
			i++;
			j = 1;
		}
	}
}
