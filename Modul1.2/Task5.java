import java.util.Scanner;
public class Task5 {

    public static int getFirstDigit(int number) {
        number = Math.abs(number);
        while (number >= 10) {
            number /= 10;
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int first1 = getFirstDigit(num1);
        int first2 = getFirstDigit(num2);

        System.out.println("Первое число: " + num1 + " -> первая цифра: " + first1);
        System.out.println("Второе число: " + num2 + " -> первая цифра: " + first2);

        if (first1 == first2) {
            System.out.println("✓ Первые цифры совпадают!");
        } else {
            System.out.println("✗ Первые цифры не совпадают!");
        }

        scanner.close();
    }
}