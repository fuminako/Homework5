public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientOS = 1;
        int clientDeviceYear = 2022;
        if (clientOS == 0 && clientDeviceYear >=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");  //Не использовала вложенный if из-за критериев задания
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
}