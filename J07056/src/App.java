import java.util.*;
import java.io.*;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        //Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Customers> list = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            list.add(Customers.newCustomers(sc));
        }

        list.sort((a,b) -> b.total - a.total);
        list.forEach(System.out::println);
    }
}

class Customers{
    private String name,type,id;
    private int first,end,quota;
    public static int count = 1;
    public int total;

    public Customers(String name, String type, int first, int end) {
        this.id = String.format("KH%02d", count++);
        this.name = Normalize(name);
        this.type = type;
        this.first = first;
        this.end = end;

        switch(type){
            case "A":
                this.quota = 100;
                break;
            case "B":
                this.quota = 500;
                break;
            case "C":
                this.quota = 200;
                break;
        }

        this.total = inquota() + outquota() + VAT();
    }

    public static Customers newCustomers(Scanner sc){
        String name = sc.nextLine();
        String[] s = sc.nextLine().split("\\s+");
        String type = s[0];
        int first = Integer.parseInt(s[1]);
        int end = Integer.parseInt(s[2]);
        return new Customers(name, type, first, end);
    }

    public String Normalize(String s){
        String[] arr = s.trim().split("\\s+");
        String res = "";
        for (String string : arr) {
            res += string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }

    public int inquota() {
        int electricNumber = end - first;
        return Math.min(quota, electricNumber) * 450;
    }

    public int outquota() {
        int electricNumber = end - first;
        return electricNumber <= quota ? 0 : (electricNumber - quota) * 1000;
    }

    public int VAT(){
        return (int) (outquota() / 20);
    }

    @Override
    public String toString(){
        return id + " " + name + " " + inquota() + " " + outquota() + " " + VAT() + " " + total  ;
    }
}