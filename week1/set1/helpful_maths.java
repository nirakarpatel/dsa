import java.util.*;

public class helpful_maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
 
        String[] arr = s.split("\\+");
        Arrays.sort(arr);
 
        System.out.println(String.join("+", arr));
        sc.close();
    }
}
