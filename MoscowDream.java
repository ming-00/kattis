import java.util.Scanner;

public class MoscowDream {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);        
	       	int a = sc.nextInt();        
	       	int b = sc.nextInt();         
		int c = sc.nextInt();        
	       	int n = sc.nextInt();        
	       	System.out.println(a > 0 && b > 0 && c > 0 && a + b + c >= n && n >= 3
			       	? "YES"
					   : "NO");
					   
		sc.close();
	}
}

