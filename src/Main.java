import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int productionYear = 2015;
        printInfoAboutDevice(clientOS, productionYear);
        for (int deliveryDistance = 0; deliveryDistance <=200; deliveryDistance++) {
            int deliveryDays = summaDeliviryDays(deliveryDistance);
            System.out.println("Потребуется дней"+ deliveryDays);
        }

    }
    private static int summaDeliviryDays(int deliveryDistance) {
        int deliveryDays;
        int startInterval = 20;
        if(deliveryDistance < 0) {
            return -1;
        }
        if (deliveryDistance <=startInterval) {
            deliveryDays = 1;
        }
        else {
            deliveryDays = 1+(int) Math.ceil((deliveryDistance - startInterval) /400 );

        }
        return deliveryDays;

    }
    public static String getOSbyType (int type) {
        if (type == 1) {
            return "Android";
        } else {
            return "iOS";

        }
    }
    private static String getTypeofVersion(int productionYear) {
        int currentYear = LocalDate.now().getYear();
        if (productionYear == currentYear) {
            return "обычную ";
        } else {
            return "lite ";


        }
    }

    private static void printInfoAboutDevice(int type, int productionYear) {
        String os = getOSbyType(type);
        String typeofVersion = getTypeofVersion(productionYear);
        System.out.println("Установите " + typeofVersion + " версию приложения для " + os);

    }
}