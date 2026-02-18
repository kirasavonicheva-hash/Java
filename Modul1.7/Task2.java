import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество степеней двойки для вывода: ");
        int n = scanner.nextInt();
        System.out.println("Первые " + n + " степеней двойки:");
        int power = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("2^" + i + " = " + power);
            power *= 2;
        }
        scanner.close();
    }
}