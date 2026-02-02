import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Количество цифр: 1");
        } else {
            int count = (int) Math.log10(Math.abs(number)) + 1;
            System.out.println("Количество цифр: " + count);
        }

        scanner.close();
    }
}