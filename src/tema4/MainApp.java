package tema4;

import java.util.*;

public class MainApp
{
    private static Integer cmmdc(Integer x, Integer y)
    {
        while (x != y)
        {
            if (x > y) x -= y;
            else y -= x;
        }
        return x;
    }

    public static void main(String[] args)
    {
        Random rng = new Random();
        Integer x, y;
        rng.setSeed(System.currentTimeMillis());
        do { x = rng.nextInt(30); } while (x == 0);
        do { y = rng.nextInt(30); } while (y == 0);

        System.out.println("~~ cele doua numere generate aleator:");
        System.out.println(x + " " + y);
        System.out.println("cel mai mare divizor comun = " + cmmdc(x, y));
    }
}
