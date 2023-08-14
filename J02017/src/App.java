import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    
    public static void Solve(){
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }
        while(true){
            boolean stop = true;
            for(int i = 0 ; i < a.size() - 1; i++){
                if((a.get(i) + a.get(i + 1)) % 2 == 0 ){
                    a.remove(i);
                    a.remove(i + 1);
                    i--;
                    stop = false;
                }
            }
        if(stop){
            System.out.println(a.size());
            return ; 
            }
        }
    }

    public static void main(String[] args) throws Exception {
         Solve();
    }
}


