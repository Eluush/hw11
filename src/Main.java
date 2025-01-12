public class Main {

    public static String calculateLeapYear(int i) {
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            return i + " год - високосный";
        } else {
            return i + " год - не високосный";

        }
    }

    public static String checkMonth(int clientOs) {
        int clientDeviceYear = 2014;

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

    public static String printName(int deliveryDistance){

        if (deliveryDistance < 20) {
            return "Потребуется 1 день на доставку ";
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return "Потребуется 2 дня на доставку ";
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return "Потребуется 3 дня на доставку ";
        }else {
            return "Нет доставки";
        }
    }
}

