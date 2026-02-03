import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число (делимое): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число (делитель): ");
        int b = scanner.nextInt();
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль невозможно!");
        } else {
            int remainder = a % b;
            System.out.println("Остаток от деления " + a + " на " + b + ": " + remainder);
            int quotient = a / b;
            System.out.println(a + " / " + b + " = " + quotient + " и остаток " + remainder);
            System.out.println("Проверка: " + b + " * " + quotient + " + " + remainder + " = " + (b * quotient + remainder));
        }
        scanner.close();
    }
}