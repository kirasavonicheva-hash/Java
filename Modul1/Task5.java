public class Task5 {
        public static void main(String[] args) {
            int number = 123;
            int base = 16;
            String numberAsString = convertToString(number, base);
            System.out.println(number + " в системе счисления " + base + ": " + numberAsString);
        }
        public static String convertToString(int number, int base) {
            return Integer.toString(number, base);
        }
    }
