public class Task4 {
        public static void main(String[] args) {
            int number = 5;
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Факториал числа " + number + " равен " + factorial);
        }
    }
