import java.io.*;
import java.util.*;
import java.math.*;

public class quickestimate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println(sc.nextLine().length());
        }

        sc.close();
    }

}
