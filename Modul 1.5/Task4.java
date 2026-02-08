import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество килобайт: ");
        int kb = scanner.nextInt();
        int bytes = kb * 1024;
        System.out.println(kb + " килобайт = " + bytes + " байт");
        scanner.close();
    }
}