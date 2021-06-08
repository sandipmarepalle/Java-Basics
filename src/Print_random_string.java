import java.util.*;
public class Print_random_string {

    static String getAlphaNumericString(int n)
    {
        int lowerLimit = 97;
        int upperLimit = 122;

        Random random = new Random();
        StringBuffer r = new StringBuffer(n);

        for (int i = 0; i < n; i++) {
            int nextRandomChar = lowerLimit
                    + (int)(random.nextFloat()
                    * (upperLimit - lowerLimit + 1));
            r.append((char)nextRandomChar);
        }
        return r.toString();
    }
    public static void main(String[] args)
    {
        int n = 20;
        System.out.println(getAlphaNumericString(n));
    }
}