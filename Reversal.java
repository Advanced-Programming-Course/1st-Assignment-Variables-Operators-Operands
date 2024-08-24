import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reversedNumber = 0;
        reversedNumber += (number % 10) * 1000;
        reversedNumber += ((number / 10) % 10) * 100;
        reversedNumber += ((number / 100) % 10) * 10;
        reversedNumber += (number / 1000);
        System.out.println(reversedNumber);
    }
}
