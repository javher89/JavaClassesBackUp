package Class4;

public class NestedIfDemo7 {
    public static void main(String[] args) {

        int money = 1000;
        String day = "Sunday";
        boolean mood = true;

        if (money > 700) {

            if (mood) { //sister bracket is related to else, related mood
                System.out.println("Lets go shopping");
            }else { //Else condition is dependent on mood
                System.out.println("Lets save some money first");
        }
        }

    }
}
