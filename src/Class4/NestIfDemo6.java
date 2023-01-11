package Class4;

public class NestIfDemo6 {
    public static void main(String[] args) {

        int money = 600;
        String day = "Sunday";
        boolean mood = false;

        if (money > 700) { //sister bracket is related to else, related money

            if (mood) {
                System.out.println("Lets go shopping");
            }
        } else { // Else condition is dependent on money
            System.out.println("Lets save some money first");
        }

    }
}
