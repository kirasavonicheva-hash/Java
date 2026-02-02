import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int lastDigit = Math.abs(number % 10);

        System.out.println("Последняя цифра числа " + number + ": " + lastDigit);

        scanner.close();
    }
}