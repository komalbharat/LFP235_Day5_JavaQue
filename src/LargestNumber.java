import java.util.Scanner;
//fing largest number among Three number

public class LargestNumber {
    public static void main(String[] args){
        int a=100, b=200, c=400;
        if(a>=b && b>=c){
            System.out.printf(a + " Is The Greatest Number");
        }
        else if (b>=a && b>=c){
            System.out.printf(b + " Is The Greatest Number");
        }
        else {
            System.out.printf(c + " Is The Greatest Number");
        }

    }
}
