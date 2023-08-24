import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    static  long prime( long n){
        if(n<2) return 0;
        if(n==2 || n==3) return 1 ;
        if(n%2==0 || n%3==0) return 0 ;
        for(long i=5;i<=Math.sqrt(n);i+=6){
            if(n%i==0||n%(i+2)==0) return 0 ;
        }
        return 1 ;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> list = (List<Integer>) ois.readObject();
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0,min = 0 ;
        for(Integer x:list){
            if(x>max) max = x ;
            if(x<min) min = x ;
            if(prime(x)==1){
                if(map.containsKey(x)){
                    map.put(x, map.get(x)+1);
                }else{
                    map.put(x, 1);
                }
            }
        }
        for(int i = min ; i <= max ; i++){
            if(map.containsKey(i)){
                System.out.println(i+" "+map.get(i));
            }
        }
        ois.close();
    }
}
