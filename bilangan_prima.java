import java.util.*;
import java.lang.Math;

public class bilangan_prima {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, x, prima, sum, nilai;

        n = Integer.parseInt(input.nextLine());
        x = 2;
        System.out.println(x);
        prima = 0;
        while (x <= n) {
            System.out.println(isPrima(x));
            sum = sum - nilai;
            x = x + 1;
        }
    }
}
