public class strStr {

    public int calculateStrIndex(String haystack, String needle) {
        int nLen = needle.length();
        System.out.println(nLen);
        int hLen = haystack.length();
        System.out.println(hLen);
        
        for (int i = 0; i < hLen - nLen + 1; i++) {
            String str = haystack.substring(i, i+nLen);
            System.out.println(str);
            if (str.equals(needle)) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String h = "hello";
        String n = "ll";

        strStr s = new strStr();
        int ans = s.calculateStrIndex(h, n);
        System.out.println(ans);
    }
}
