import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        s1 = s1.toUpperCase();
        s2 = s2.toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3.charAt(3));
    }
}
