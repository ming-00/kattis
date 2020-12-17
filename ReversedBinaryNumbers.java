import java.util.Scanner;

public class ReversedBinaryNumbers {

	static int converter(int num)  {
		String binary = Integer.toBinaryString(num);
		int len = binary.length();
		String converted = "";

		for (int i = len - 1; i >= 0; i--) {	
			converted += binary.charAt(i);
		}

		return Integer.parseInt(converted, 2);
	}
			


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(converter(num));
		sc.close();
	}
}

