import java.util.Scanner;
public class Solution {
    static boolean isLucky(int x) {
        while (x > 0) {
            int d = x % 10;
            if (d != 4 && d != 7)
                return false;
            x /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ok = false;
        for (int i = 1; i <= n; i++) {
            if (isLucky(i) && n % i == 0) {
                ok = true;
                break;
            }
        }System.out.println(ok ? "YES" : "NO");
    }
}
