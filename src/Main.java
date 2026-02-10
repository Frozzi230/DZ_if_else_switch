//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int clientOS = 0;
        switch (clientOS) {
            case 0: {
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            }
            case 1: {
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            }
        }

        System.out.println();

        System.out.println("Задача №2");
        clientOS = 1;
        short clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case 0: {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                }
                case 1: {
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                }
            }
        } else {
            switch (clientOS) {
                case 0: {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                }
                case 1: {
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                }
            }
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
            case 1:
                System.out.println("1-й месяц (январь) принадлежит к сезону зима");break;

            case 2:
                System.out.println("2-й месяц (февраль) принадлежит к сезону зима");break;

            case 3:
                System.out.println("3-й месяц (март) принадлежит к сезону весна");break;
            case 4:
                System.out.println("4-й месяц (апрель) принадлежит к сезону весна");break;
            case 5:
                System.out.println("5-й месяц (май) принадлежит к сезону весна");break;
            case 6:
                System.out.println("6-й месяц (июнь) принадлежит к сезону лето");break;
            case 7:
                System.out.println("7-й месяц (июль) принадлежит к сезону лето");break;
            case 8:
                System.out.println("8-й месяц (август) принадлежит к сезону лето");break;
            case 9:
                System.out.println("9-й месяц (сентябрь) принадлежит к сезону осень");break;
            case 10:
                System.out.println("10-й месяц (октябрь) принадлежит к сезону осень");break;
            case 11:
                System.out.println("11-й месяц (ноябрь) принадлежит к сезону осень");break;
            case 12:
                System.out.println("12-й месяц (декабрь) принадлежит к сезону зима");break;
            default:
                break;
        }
    }
}