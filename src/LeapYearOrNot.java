public class LeapYearOrNot {
    public static void main(String [] args){
        int year =2000;
        if(year % 4 == 0 || year% 100==0) {          //if condition check year*4
            System.out.println(year + " Year is Leap year");
        }
        else
        {
            System.out.println(year +" Year is not leap year"); }
    }
}
