import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца (1-12): ");
        byte month = scanner.nextByte();
        String[] monthNames = {
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };
        if (month >= 1 && month <= 12) {
            System.out.println("\nМесяц №" + month + " - " + monthNames[month - 1]);
            String season;
            if (month == 12 || month == 1 || month == 2) {
                season = "Зима ❄️";
            } else if (month >= 3 && month <= 5) {
                season = "Весна 🌸";
            } else if (month >= 6 && month <= 8) {
                season = "Лето ☀️";
            } else {
                season = "Осень 🍂";
            }
            System.out.println("Пора года: " + season);
            System.out.println("\nДругие месяцы этой поры года:");
            switch (month) {
                case 12: case 1: case 2:
                    System.out.println("Декабрь, Январь, Февраль");
                    break;
                case 3: case 4: case 5:
                    System.out.println("Март, Апрель, Май");
                    break;
                case 6: case 7: case 8:
                    System.out.println("Июнь, Июль, Август");
                    break;
                case 9: case 10: case 11:
                    System.out.println("Сентябрь, Октябрь, Ноябрь");
                    break;
            }
        } else {
            System.out.println("Ошибка! Введите число от 1 до 12");
        }
        scanner.close();
    }
}