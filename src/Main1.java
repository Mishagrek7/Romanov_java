import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String a = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String b = scanner.nextLine();

        if (!a.equals(b)) {
            System.out.println("Строки неидентичны");
        } else {
            System.out.println("Строки идентичны");
        }
    }
}