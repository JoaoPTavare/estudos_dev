import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n[] = {45001, 20, 39, 142, 35, 6};
        for (int i = 0; i <= n.length - 1; i++) {
            System.out.println(n[i]);
        }




        String mes[] = {"janeiro", "fevereiro", "Março", "Abril", "Maio", "Junho", "Julho",
                "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int not[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int c=0; c< mes.length;c++){
            System.out.println("o mes " + mes[c] + " tem " + not[c] + "dias!" );
        }


        double l[] = {4.4, -9,1,55.1,-7};
        for (double v: l) {
            Arrays.sort(l);
            System.out.print(v + " ");
        }
        for (int c =0; c<=100; c++){
            System.out.println("A GEOVANA È ZE RUELA");
        }


    }
}
