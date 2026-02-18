public class Task4 {
    public static void main(String[] args) {
        int number = 12345;
        String numberStr = String.valueOf(number);
        StringBuilder sb = new StringBuilder(numberStr);
        String reversedStr = sb.reverse().toString();
        int reversed = Integer.parseInt(reversedStr);
        System.out.println("Исходное число: " + number);
        System.out.println("Перевернутое число: " + reversed);
    }
}