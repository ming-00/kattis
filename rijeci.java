// https://open.kattis.com/problems/rijeci

import java.io.*;
import java.util.*;

public class rijeci {

    static public Map<Integer, Integer> memoizeA = new HashMap<>();
    static public Map<Integer, Integer> memoizeB = new HashMap<>();

    static int calculateA(int K) {
        if (K == 0) {
            return 1;
        } else {
            if (memoizeB.containsKey(K - 1)) {
                memoizeA.put(K, memoizeB.get(K - 1));
                return memoizeB.get(K - 1);
            } else {
                int num =  calculateB(K - 1);
                memoizeA.put(K, num);
                return num;
            }
        }
    }

    static int calculateB(int K) {
        if (K == 0) {
            return 0;
        } else if (K == 1) {
            return 1;
        } else {
            int numA = 0;
            int numB = 0;

            if(memoizeA.containsKey(K - 1)) {
                numA = memoizeA.get(K - 1);
            } else {
                numA = calculateA(K - 1);
            }

            if (memoizeB.containsKey(K - 1)) {
                numB = memoizeB.get(K - 1);
            } else {
                numB = calculateB(K - 1);
            }
            
            int answer = calculateB(K - 1) + calculateA(K - 1);
            memoizeB.put(K, answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        sc.close();

        memoizeA.put(0, 1);
        memoizeB.put(0, 0);
        memoizeB.put(1, 1);

        int num_of_A = calculateA(K);
        int num_of_B = calculateB(K);

        System.out.println(num_of_A + " " + num_of_B);
    }
}
