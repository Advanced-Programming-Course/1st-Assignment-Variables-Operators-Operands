import java.util.*;

class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        m = m - n;
        n = m + n;
        m = n - m;
        System.out.println(m + " " +n);
    }
}
