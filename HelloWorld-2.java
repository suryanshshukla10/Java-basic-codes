public class HelloWorld {
    public static void main(String[] args) {
        int High = 180;
        int low = 60;
        if (High <= 90 && low <= 60) {
            System.out.println("your BP is low");
        } else if (High <= 120 && low <= 80) {
            System.out.println("your BP is normal");
        } else if (High <= 140 && low <= 90) {
            System.out.println("your BP is pre high");
        } else if (High <= 190 && low <= 100) {
            System.out.println("you have a high BP ");
        } else {
            System.out.println("you have entered a wrong value");
        }

        System.out.println("Stay Healthy, Stay Fit");
    }
}


