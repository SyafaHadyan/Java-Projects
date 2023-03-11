import java.util.Scanner;

public class Switch {

    public static void main(String[] args) throws Exception {

        Scanner dayinput = new Scanner(System.in);

        System.out.println("Enter Day:");
        String day = dayinput.nextLine();
        Scanner.nextLine();

        switch (day.toLowerCase()) {
            case "sunday":
                System.out.println("It is Sunday");
                break;

            case "monday":
                System.out.println("It is Monday");
                break;

            case "tuesday":
                System.out.println("It is Tuesday");
                break;

            case "wednesday":
                System.out.println("It is Wednesday");
                break;

            case "thursday":
                System.out.println("It is Thursday");
                break;

            case "friday":
                System.out.println("It is Friday");
                break;

            case "saturday":
                System.out.println("It is Saturday");
                break;

            default:
                System.out.println("Invalid Day");
                break;
        }
        
    }
}
