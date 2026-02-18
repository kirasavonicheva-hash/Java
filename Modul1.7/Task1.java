public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i += 2;
        }
        System.out.println("Сумма всех нечетных чисел от 1 до 100: " + sum);
    }
}