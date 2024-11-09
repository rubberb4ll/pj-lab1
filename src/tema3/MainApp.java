package tema3;

import java.util.*;

public class MainApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Integer n, i = 0;
        System.out.print("n? = ");
        n = scanner.nextInt();
        System.out.println();

        if (n == 0) System.out.println("~~ numarul ales nu are divizori!");
        else
        {
            System.out.println("~~ divizorii numarului ales:");
            for (Integer div = 1; div <= Math.abs(n) / 2; div++)
                if (n % div == 0)
                {
                    i++;
                    System.out.print(div + " ");
                }
            System.out.println(Math.abs(n));
            if (i == 1) System.out.println("~~ (numarul ales este prim!)");
        }

        scanner.close();
    }
}
