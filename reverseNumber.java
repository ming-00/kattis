public class reverseNumber {
    public static int reverse(int x) {
        int originalNumber = x;
        int newNumber = 0;
        
        while (originalNumber != 0) {
            int value = originalNumber%10;
            newNumber = newNumber * 10 + value;
            System.out.println(newNumber);
            originalNumber = (originalNumber - originalNumber%10)/10;
        }
        
        if (x > 0 && newNumber < 0 || x < 0 && newNumber > 0 || x == 0) {
            return 0;
        } else {
            return newNumber;
        }
    }

    public static void main(String[] args) {
        System.out.println(964632435 * 10);
        System.out.println(reverse(1534236469));
    }
}
