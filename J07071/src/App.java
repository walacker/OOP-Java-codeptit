import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Name> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(Name.getName(sc));
        }

        list.sort((a,b) -> a.getFirst().equals(b.getFirst()) ? a.getLast().compareTo(b.getLast()) : a.getFirst().compareTo(b.getFirst())) ;

        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < m ; i++){
            String s = sc.nextLine();
            for(Name x : list){
                String res = x.getAcr();
                if(check(res,s) == true) System.out.println(x);
            }
        }
    }

    public static boolean check(String s1,String s2){
        if(s1.length() - 1 != s2.length()) return false;
        int cnt = 0;
        for(int i = 0 ; i < s1.length() ; i+= 2){
            if(s1.charAt(i) != s2.charAt(i)){
                if(s2.charAt(i) == '*') cnt++;
                else return false; 
            }
        }
        if(cnt > 1) return false;
        return true;
    }
}

class Name{
    private String name,first,last;

    public Name(String name){
        this.name = name;
        String[] arr = name.split(" ");
        last = arr[0];
        first = arr[arr.length - 1];
    }

    public static Name getName(Scanner sc){
        return new Name(sc.nextLine());
    }

    public String getFirst(){
        return this.first;
    }

    public String getLast(){
        return this.last;
    }

    public String getAcr(){
        String res = "";
        for(String s: name.split(" ")){
            res += s.substring(0, 1).toUpperCase() + ".";
        }
        return res;
    }
    @Override public String toString(){
        return name;
    }

}
