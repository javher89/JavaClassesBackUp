package class2;

public class StringAddition {
    public static void main(String[] args) {
        String firstName="George";
        String lastName="Michael";
        //String concatenation is adding tw strings together

        System.out.println("****"+firstName+" "+lastName+"*****");
        System.out.println(firstName+" "+lastName);
        System.out.println("First Name ="+firstName);
        System.out.println("LastName = " + lastName);

        System.out.println("10" + "10");
        String space=" ";
        System.out.println(firstName+space+lastName);
        System.out.println(firstName+" "+lastName);

        System.out.println(firstName+10);
        System.out.println(firstName+" "+10);
        System.out.println(firstName+10.5);
        System.out.println(firstName+true);
        System.out.println(firstName+" "+true);
    }
}
