import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Store> list = new ArrayList<>();
        while(n-->0){
            list.add(Store.newproduct(sc));
        }
        
        list.sort((a, b) -> {
            if (a.getPrice() < b.getPrice())    return 1;
            else if (a.getPrice() == b.getPrice())  return a.getId().compareTo(b.getId());
            return -1;
        });

        list.forEach(System.out::println);
    }
}

class Store{
    private String code,name,price,month;
    Scanner sc = new Scanner(System.in);

    public Store() {
    }

    public Store(String code,String name,String price,String month){
        this.code = code;
        this.name = name;
        this.price = price;
        this.month = month;
    }

    public static Store newproduct(Scanner sc){
        String code = sc.nextLine();
        String name = sc.nextLine();
        String price = sc.nextLine();
        String month = sc.nextLine();
        Store store = new Store(code,name,price,month);
        return store;
    }

    public String getId(){
        return this.code;
    }

    public double getPrice(){
        return Double.parseDouble(this.price);
    }

    @Override
    public String toString() {
        return code + " " + name + " " + price + " " + month;
    }
}
