import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int number2 = scanner.nextInt();
        if (number2 == 0) {
            System.out.println("Ошибка: деление на ноль невозможно!");
        } else if (number1 % number2 == 0) {
            System.out.println("Число " + number1 + " делится на " + number2 + " без остатка");
        } else {
            System.out.println("Число " + number1 + " НЕ делится на " + number2 + " без остатка");
            System.out.println("Остаток от деления: " + (number1 % number2));
        }
        scanner.close();
    }
}