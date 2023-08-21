import java.util.ArrayList;
import java.util.Scanner;

class Store implements Comparable<Store>{
    String code,name,unit ; 
    private int inprice,outprice;

    Store(int d, String name, String unit, int inprice, int outprice){
        this.code = "MH" + String.format("%03d", d);
        this.name = name;
        this.unit = unit;
        this.inprice = inprice;
        this.outprice = outprice;
    }

    public int getInprice() {
        return inprice;
    }

    public int getOutprice() {
        return outprice;
    }

    public int getProfit(){
        return outprice - inprice;
    }
    @Override
    public String toString() {
        return code + " " + name + " " + unit + " " + inprice + " " + outprice + " " + getProfit();
    }

    @Override
    public int compareTo(Store other) {
        return other.getProfit() - this.getProfit() ;
    }
}

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void Solve(){
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Store> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++ ) {
            String name = sc.nextLine();
            String unit = sc.nextLine();
            int inprice = Integer.parseInt(sc.nextLine());
            int outprice = Integer.parseInt(sc.nextLine());
            list.add(new Store(i+1, name, unit, inprice, outprice));
        }
        
        list.sort(null);
        for(Store i : list) System.out.println(i);
    }

    public static void main(String[] args) throws Exception {
        Solve();
        sc.close();
    }
}