import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        if (input.length() > 1) {
            char preLastChar = input.charAt(input.length() - 2);
            System.out.println("Предпоследний символ: " + preLastChar);
        } else {
            System.out.println("Строка слишком короткая (меньше 2 символов)");
        }
        scanner.close();
    }
}