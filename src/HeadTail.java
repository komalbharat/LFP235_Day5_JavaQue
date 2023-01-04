//Flip Coin and print percentage of Heads and Tails
//a. I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
//b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
//heads
//c. O/P -> Percentage of Head vs Tails
import java.util.Random;
    class Toss {
        public String chanceFunc() {
            Random r = new Random();
            int chance = r.nextInt(2);
            if (chance == 1) {
                return"tails";
            } else {
                return"heads";
            }
        }
    }
    public class HeadTail {
        public static void main(String[] args) {
            Toss t = new Toss();
            int heads = 0;
            int tails = 0;
            int chances = 10;
            for (int i = 1; i<= chances; i++) {
                if (t.chanceFunc().equals("tails")) {
                    tails++;
                } else {
                    heads++;
                }
            }
            System.out.println("Chances = " + chances);
            System.out.println("Heads: " + heads);
            System.out.println("Tails: " + tails);
        }
    }

