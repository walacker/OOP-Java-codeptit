import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Items> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(Items.newItem(sc));
        }

        list.sort((a,b) -> (int)(b.getprice() - a.getprice()));
        list.forEach(System.out::println);
    }
}

class Items{
    private String code,name,group;
    private double in,out; 
    public static int count = 1;

    public Items(String name, String group, Double in, Double out) {
        this.code = String.format("MH%02d", count++);
        this.name = name;
        this.group = group;
        this.in = in;
        this.out = out;
    }

    public static Items newItem(Scanner sc){
        String name = sc.nextLine();
        String group = sc.nextLine();
        Double in = Double.parseDouble(sc.nextLine());
        Double out = Double.parseDouble(sc.nextLine());
        return new Items(name, group, in, out);
    }

    public Double getprice(){
        return this.out - this.in;
    }

    public String toprice(){
        return String.format("%.2f", getprice());
    }
    @Override
    public String toString() {
        return code + " " + name + " " + group + " " + toprice();
    }
}
