package tema5;

import java.util.*;

public class MainApp
{
    private static Boolean verifFibonacci(Integer nr)
    {
        Integer fib1 = 0,
                fib2 = 1;
        while (fib2 <= nr)
        {
            Integer aux = fib1;
            fib1 = fib2;
            fib2 += aux;
            if (fib2 == nr) return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Random rng = new Random();
        Integer n;
        rng.setSeed(System.currentTimeMillis());
        n = rng.nextInt(20);

        System.out.println("~~ numarul generat aleator:");
        System.out.print(n);
        if (!verifFibonacci(n)) System.out.print(" NU");
        System.out.print(" apartine sirului fibonacci!");
    }
}
