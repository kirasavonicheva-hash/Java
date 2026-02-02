import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        number = Math.abs(number);

        while (number >= 10) {
            number = number / 10;
        }

        System.out.println("Первая цифра: " + number);

        scanner.close();
    }
}