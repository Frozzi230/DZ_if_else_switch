//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            System.out.println("Установите версию приложения для Android по ссылке");

        System.out.println();

        System.out.println("Задача №2");
        clientOS = 1;
        short clientDeviceYear = 2004;

        if (clientDeviceYear < 2015) {
            System.out.print("Установите облегченную версию приложения ");
        } else {
            System.out.print("Установите версию приложения ");
        }

        if (clientOS == 0) {
            System.out.println("для iOS по ссылке");
        } else {
            System.out.println("для Android по ссылке");
        }

        System.out.println();

        System.out.println("Задача №3");
        int creatLeapYear = 1584;
        int year = 1913;
        if ((year > creatLeapYear && (year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " Год не является високосным");
        }

        System.out.println();

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = day + 1;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day = day + 2;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println();

        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Месяц принадлежит к сезону зима");
                break;
            case 3, 4, 5:
                System.out.println("Месяц принадлежит к сезону весна");
                break;
            case 6, 7, 8:
                System.out.println("Месяц принадлежит к сезону лето");
                break;
            case 9, 10, 11:
                System.out.println("Месяц принадлежит к сезону осень");
                break;
            default:
                break;
        }
    }
}
