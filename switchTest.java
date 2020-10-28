public class switchTest {
    public static void main(String[] args) {
        int day = 7;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tusday");
            case 3:
                System.out.println("Wedneday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("this is not a valid number");
        }

    }
}
