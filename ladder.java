import java.io.*;
import java.util.*;
import java.math.*;

public class ladder {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int v = sc.nextInt();
        System.out.println((int) Math.ceil(h/ Math.sin(Math.toRadians(v))));
        sc.close();
    }
}
