public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Приложение не поддерживается данной операционной системой");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        byte clientOS = 0;
        int clientDeviceYear = 2014;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear  >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Приложение не поддерживается данной операционной системой");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2100;
        switch (year % 4) {
            case 0:
                if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0)) {
                    System.out.println(year + " год является високосным");
                } else if (year % 100 == 0 && year % 400 != 0){
                    System.out.println(year + " год не является високосным");
                }
                break;
            default:
                System.out.println(year + " год не является високосным");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 44;
        int day = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + day );
        } else if ((deliveryDistance >= 20 && deliveryDistance < 60)) {
            day = day + 1;
            System.out.println("Потребуется дней: " + day );
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100){
            day = day + 2;
            System.out.println("Потребуется дней: " + day );
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 7;
        switch (monthNumber) {
            case 1:
                System.out.println("месяц "+ monthNumber + " это зима");
                break;
            case 2:
                System.out.println("месяц "+ monthNumber + " это зима");
                break;
            case 3:
                System.out.println("месяц "+ monthNumber + " это весна");
                break;
            case 4:
                System.out.println("месяц "+ monthNumber + " это весна");
                break;
            case 5:
                System.out.println("месяц "+ monthNumber + " это весна");
                break;
            case 6:
                System.out.println("месяц "+ monthNumber + " это лето");
                break;
            case 7:
                System.out.println("месяц "+ monthNumber + " это лето");
                break;
            case 8:
                System.out.println("месяц "+ monthNumber + " это лето");
                break;
            case 9:
                System.out.println("месяц "+ monthNumber + " это осень");
                break;
            case 10:
                System.out.println("месяц "+ monthNumber + " это осень");
                break;
            case 11:
                System.out.println("месяц "+ monthNumber + " это осень");
                break;
            case 12:
                System.out.println("месяц "+ monthNumber + " это зима");
                break;
            default: System.out.println("Нет такого месяца");

        }
    }

}