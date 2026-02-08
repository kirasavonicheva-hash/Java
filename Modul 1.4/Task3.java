public class Task3 {
    public static void main(String[] args) {
                byte num = 30;
                if (num >= 0 && num <= 15) {
                    System.out.println("Минута " + num + " находится в первой четверти часа");
                } else if (num >= 16 && num <= 30) {
                    System.out.println("Минута " + num + " находится во второй четверти часа");
                } else if (num >= 31 && num <= 45) {
                    System.out.println("Минута " + num + " находится в третьей четверти часа");
                } else if (num >= 46 && num <= 60) {
                    System.out.println("Минута " + num + " находится в четвертой четверти часа");
                } else {
                    System.out.println("Неверное значение минуты: " + num);
                }
            }
        }
