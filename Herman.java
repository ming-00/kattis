import java.util.Scanner;

	/**
	 * Project: Herman
	 * Date: 1 March 2020
	 * @author: ming
	 * Kattis url = https://open.kattis.com/problems/herman
	 */

public class Herman{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		double euclideanArea = Math.PI * radius * radius;
		double taxicabArea = 2.0 * radius * radius;
		sc.close();

		System.out.printf("%.6f", euclideanArea);
		System.out.println();
		System.out.printf("%.6f", taxicabArea);
		System.out.println();
	}
}

