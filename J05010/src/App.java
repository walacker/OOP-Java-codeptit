import java.util.ArrayList;
import java.util.Scanner;

class Store implements Comparable<Store>{
    private String name,unit ; 
    private double inprice,outprice;
    private int code;

    Store(int d, String name, String unit, double inprice, double outprice){
        this.code = d;
        this.name = name;
        this.unit = unit;
        this.inprice = inprice;
        this.outprice = outprice;
    }

    public double getInprice() {
        return inprice;
    }

    public double getOutprice() {
        return outprice;
    }

    public double getProfit(){
        return outprice - inprice;
    }
    @Override
    public String toString() {
        double res = getProfit();

        return code + " " + name + " " + unit + " " + String.format("%.2f",res);
    }

    @Override
    public int compareTo(Store other) {
        return (int) ((int) 100 * (other.getProfit() - this.getProfit())) ;
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
            Double inprice = Double.parseDouble(sc.nextLine());
            Double outprice = Double.parseDouble(sc.nextLine());
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