
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num, maior = 0, pos = 0;

        for (int i = 1; i <= 100; i++) {
            num = leia.nextInt();

            if (num > maior) {
                maior = num;
                maior = num;
                pos = i;

            }
        }
        System.out.println(maior);
        System.out.println(pos);
    }
}
