public class Main {
    public static String calculateLeapYear(int i) {
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            return i + " год - високосный";
        } else {
            return i + " год - не високосный";
        }

    }


    public static String checkMonth(int clientOs,int clientDeviceYear ) {
        if (clientOs == 0 && clientDeviceYear < 2015) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            return "Установите версию приложения для iOS по ссылке";
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            return "Установите облегченную версию приложения для Android по ссылке ";
        } else {
            return "Установите версию приложения для Android по ссылке";
        }

    }


    public static String calculateDeliveryDays(int deliveryDistance) {

        if (deliveryDistance < 20) {
            return "Потребуется 1 день на доставку ";
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return "Потребуется 2 дня на доставку ";
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return "Потребуется 3 дня на доставку ";
        } else {
            return "Нет доставки";
        }
    }


    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2020;
        String result1 = calculateLeapYear(year);
        System.out.println(result1);
        System.out.println("Задание 2");
        int clientDeviceYear = 2014;
        int clientOs = 0;
        String result2 = checkMonth(clientOs,clientDeviceYear);
        System.out.println(result2);
        System.out.println("Задание 3");
        int deliveryDistance= 30;
        String result3 =calculateDeliveryDays( deliveryDistance);
        System.out.println(result3);


    }
}

