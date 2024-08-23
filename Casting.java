import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = (int) scanner.nextFloat();
        int d = (int) scanner.nextFloat();
        System.out.println(d * c);
        System.out.println(c + d);

    }
}
