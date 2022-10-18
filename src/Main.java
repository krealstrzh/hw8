import java.time.LocalDate;

public class Main {
//    Задание 1
    public static void checkGapYear(int year) {
        if (year % 400 == 0) {
            System.out.println("Gap year!");
        } else if (year % 100 == 0) {
            System.out.println("Not a gap year...");
        } else if (year % 4 == 0) {
            System.out.println("Gap year!");
        } else {
            System.out.println("Not a gap year...");
        }
    }

    //    Задание 2
    public static int checkOS(String name) {
        if (name.equalsIgnoreCase("iOS")) {
            return 0;
        } else if (name.equalsIgnoreCase("Android")) {
            return 1;
        } else {
            System.out.println("Ошибка в написании ОС :(");
            return 2;
        }
    }
    public static boolean checkDeviceYear (int year) {
        int currentYear = LocalDate.now().getYear();
        return year >= currentYear;
    }
    public static void printMessageLink (int OS, boolean year) {
        if (OS == 0 && year) {
            System.out.println("Установите версию для iOS по ссылке");
        } else if (OS == 0) {
            System.out.println("Установите lite-версию для iOS по ссылке");
        } else if (OS == 1 && year) {
            System.out.println("Установите версию для Android по ссылке");
        } else if (OS == 1) {
            System.out.println("Установите lite-версию для Android по ссылке");
        } else {
            System.out.println("Данная ОС не поддерживается :( Проверьте правильность написания названия ОС");
        }

    }

    //    Задание 3
    public static void checkDistance(int distance) {
        if (distance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется 2 дня");
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("К сожалению, мы не доставляем так далеко :(");
        }
    }
    public static void main(String[] args) {
//        Задание 1
        int yearToCheck = 2020;
        checkGapYear(yearToCheck);
//        Задание 2
        String nameOS = "android";
        int clientYear = 2021;
        int resultOS = checkOS(nameOS);
        boolean deviceYear = checkDeviceYear(clientYear);
        printMessageLink(resultOS, deviceYear);
//        Задание 3
        int deliveryDistance = 12;
        checkDistance(deliveryDistance);
    }
}