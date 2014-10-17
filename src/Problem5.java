/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * <p/>
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {

    public static void main(String[] args) {


        System.out.println("Result: " + getSmallestPositive(2520L));


    }

    public static long getSmallestPositive(long i) {


        boolean found = false;

        while (!found) {
            System.out.println(i);
            loop:
            for (int n = 2; n < 21; n++) {

                if (i % n != 0) {
                    break loop;
                }
                found = true;

            }
            i++;
        }

        return i;
    }
}
