import java.util.Scanner;

public class SwapNumbers {
    public static void main(String []args){
        int x,y,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number X And Y");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("before Swapping:"+x+ ""+y);
        //swamping
        t = x;
        x = y;
        y = t;
        System.out.println("After Swapping:" +x+""+y);
        System.out.println();
    }
}
