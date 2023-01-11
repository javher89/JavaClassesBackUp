package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        //byte shorterNumber=number; //here you're trying to fit a bigger box into a smaller box
        //byte can't hold long type, but if the value of long is small enough to fit in byte, we can try:
        byte shorterNumber=(byte) number;
        //another example
        float f=10.5f;
        //int num=f; not possible with this script
        int num=(int)f; //here you're forcing Java
        System.out.println(shorterNumber);
        System.out.println(num);

        /*
        byte
        short
        int
        long
        float
        double
        we can store contents from a smaller box to a larger box, but if we try the inverse, we need to typecast
         */
        byte b=10;
        int number2=b; //int is larger than byte, Java can process with no issues
        short c=(short) number2; // we need to typeCast (add short) so Java can process it
        System.out.println(b);

        float eggs=12.5f;
        int wholePart=(int)eggs;
        System.out.println(wholePart);

        System.out.println((char)98); // these are numbers associated to letters***


    }
}
