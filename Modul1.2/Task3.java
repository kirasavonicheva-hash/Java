import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int originalNumber = number;

            number = Math.abs(number);

            if (number == 0) {
                System.out.println("Для числа 0 сумма первой и последней цифры: 0");
            } else {

                int lastDigit = number % 10;


                int firstDigit = number;
                while (firstDigit >= 10) {
                    firstDigit /= 10;
                }

                int sum = firstDigit + lastDigit;

                System.out.println("Исходное число: " + originalNumber);
                System.out.println("Абсолютное значение: " + number);
                System.out.println("Первая цифра: " + firstDigit);
                System.out.println("Последняя цифра: " + lastDigit);
                System.out.println("Сумма: " + firstDigit + " + " + lastDigit + " = " + sum);
            }
        } else {
            System.out.println("Ошибка! Введите целое число.");
        }

        scanner.close();
    }
}