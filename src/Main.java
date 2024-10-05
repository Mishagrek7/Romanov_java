import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("a = b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double division =b != 0 ? (double)a / b :0;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(division);
    }
}