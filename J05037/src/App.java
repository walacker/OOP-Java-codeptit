import java.util.*;

public class App {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Item> list = new ArrayList<>();
    static int count = 1;

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String amount = sc.nextLine();
            Float a = Float.parseFloat(sc.nextLine());
            Float b = Float.parseFloat(sc.nextLine());
            list.add(new Item(count++, name, amount, a, b));
        }

        list.sort((a, b) -> b.getOutprice() - a.getOutprice());

        list.forEach(item -> {
            System.out.println(item);
        });
    }
}

class Item {
    private String code, name, amount;
    private Float transition, price, outprice;

    public Item(int count, String name, String amount, Float a, Float b) {
        this.code = String.format("MH%02d", count);
        this.name = name;
        this.amount = amount;
        this.transition = (a * b) * 0.05f;
        this.price = a * b + this.transition;
        this.outprice = (this.price * 1.02f) / b;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getTransition() {
        return (int) Math.round(transition);
    }

    public void setTransition(Float transition) {
        this.transition = transition;
    }

    public int getPrice() {
        return (int) Math.round(price);
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getOutprice() {
        return (int) Math.ceil(outprice / 100) * 100;
    }

    public void setOutprice(Float outprice) {
        this.outprice = outprice;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + amount + " " + getTransition() + " " + getPrice() + " " + getOutprice();
    }

}
