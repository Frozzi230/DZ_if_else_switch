//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задача №1");
        int clientOS = 0;
        switch (clientOS)
        {
            case 0:
            {
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            }
            case 1:
            {
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            }
        }

        System.out.println();

        System.out.println("Задача №2");
        clientOS = 1;
        short clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear == 2015)
    }
}