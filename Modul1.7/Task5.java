public class Task5 {
    public static void main(String[] args) {
        int number = 12345;
        char[] digits = String.valueOf(number).toCharArray();
        int sum = 0;
        for (char digit : digits) {
            sum += digit - '0';
        }
        System.out.println("Число: " + number);
        System.out.println("Сумма цифр: " + sum);
    }
}