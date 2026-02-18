public class Task3 {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "456";
        String str3 = "789";
        int num1 = Integer.valueOf(str1);
        int num2 = Integer.valueOf(str2);
        int num3 = Integer.valueOf(str3);
        int sum = num1 + num2 + num3;
        System.out.println("Сумма чисел: " + sum);
    }
}