package problem045;

/**
 * Created by kiran on 1/19/16.
 *
 * riangle, pentagonal, and hexagonal numbers are generated by the following formulae:

 Triangle	 	Tn=n(n+1)/2	 	1, 3, 6, 10, 15, ...
 Pentagonal	 	Pn=n(3n−1)/2	 	1, 5, 12, 22, 35, ...
 Hexagonal	 	Hn=n(2n−1)	 	1, 6, 15, 28, 45, ...
 It can be verified that T285 = P165 = H143 = 40755.

 Find the next triangle number that is also pentagonal and hexagonal.
 */
public class Problem045 {
    public static void main(String[] args) {
        long i = 40756;

        while (!(isPentagonal(i) && isTriangular(i) && isHexagonal(i))) {
            i++;
        }

        System.out.println(i);

    }

    public static boolean isPentagonal(long n) {
        double test = (Math.sqrt(24 * n + 1) + 1) / 6;

        return (long)test == test;
    }

    public static boolean isTriangular(long n) {
        double test = Math.sqrt(8 * n + 1);

        return (long)test == test;
    }

    public static boolean isHexagonal(long n) {
        double test = (Math.sqrt(8 * n + 1) + 1) / 4;

        return (long)test == test;
    }




}