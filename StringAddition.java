import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int a = Integer.parseInt(String.valueOf(s1.charAt(1)));
        int b = Integer.parseInt(String.valueOf(s2.charAt(1)));
        System.out.println(a + b);
    }
}