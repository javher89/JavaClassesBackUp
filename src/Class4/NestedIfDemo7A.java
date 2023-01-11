package Class4;

public class NestedIfDemo7A {
    public static void main(String[] args) {

        boolean studyHard=true;
        int salary=120000;

        if(studyHard){

            System.out.println("We get the job");

            if(salary>100000){ /*If condition prints below only if salary condition is met
            if salary conidition is not met, the remaining code is not read or executed
            */
                System.out.println("Lets buy a Tesla");
            }else{
                System.out.println("Lets buy a Toyota"); //If salary condition isn't met
            }


        }else {//if boolean condition isn't met, the rest of the code is ignored
            System.out.println("It might take a little longer to get the job");
        }

    }
}
/*
Notes:
    1) For String we use equals method instead of === sign because it's a non-primitive data type
    2) we can cmd+opt+l to format our code
    3) if we are confused about brackets we can click on opening or closing part to the check the sister

If else conditions
    If I have to test the same variable for multiple conditions I should use IF Else If
    If I have multiple conditions and these conditions are dependent on eac other, use Nested If conditions
 */
