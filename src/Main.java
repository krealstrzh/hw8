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
    public static boolean checkOS(String name) {
        return name.equals("iOS");
    }
    public static boolean checkDeviceYear(int year) {
        int currentYear = LocalDate.now().getYear();
        return year >= currentYear;
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
        String nameOS = "Android";
        boolean clientOS = checkOS(nameOS);
        int clientDeviceYear = 2023;
        boolean newDevice = checkDeviceYear(clientDeviceYear);
        if (clientOS && newDevice) {
            System.out.println("Установите версию для iOS по ссылке ");
        } else if (clientOS) {
            System.out.println("Установите lite-версию для iOS по ссылке ");
        } else if (newDevice) {
            System.out.println("Установите версию для Android по ссылке ");
        } else {
            System.out.println("Установите lite-версию для Android по ссылке ");
        }
//        Задание 3
        int deliveryDistance = 12;
        checkDistance(deliveryDistance);
    }
}