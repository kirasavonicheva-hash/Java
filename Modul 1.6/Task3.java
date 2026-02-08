import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество мегабайт: ");
        int mb = scanner.nextInt();
        long bytes = (long) mb * 1024 * 1024;
        System.out.println(mb + " мегабайт = " + bytes + " байт");
        scanner.close();
    }
}