import java.util.Scanner;

public class codeLang {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("? ");

        String lang = inp.nextLine();
        String ans = "";

        if (lang.equalsIgnoreCase("Python")) {
            ans += "\"Python\"\n";

        } else if (lang.equalsIgnoreCase("C++")) {
            ans += "\"C++\"\n";
        }
        System.out.println(ans);
        inp.close();
    }
}