import java.util.Scanner;

public class BinaryTest {
    public static void main (String[] args){

        Scanner inp = new Scanner(System.in);
        System.out.print("? ");

        String s;


        while (!(s = inp.nextLine().replaceAll(" ","")).equals("-1")){

            System.out.printf("%04x\n", Integer.parseInt(s, 2));

        }


    }
}