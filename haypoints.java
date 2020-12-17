import java.util.*;
import java.io.*;
import java.math.*;

public class haypoints {

    public static Map<String, Integer> jobs = new HashMap<>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int numOfJobs = sc.nextInt();
        int numOfDescriptions = sc.nextInt();


        for (int i = 0; i < numOfJobs; numOfJobs++) {
            jobs.put(sc.nextLine(), sc.nextInt());
        }

        for (int j = 0; 
    }
}
