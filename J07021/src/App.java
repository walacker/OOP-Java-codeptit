import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static String Standart(String s){
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        //Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.equals("END")) break;
            String[] a = s.trim().split("\\s+");
            for(int i = 0; i < a.length; i++){
                System.out.printf(Standart(a[i]) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
