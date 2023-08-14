import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static int check(String s){
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            if( s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '2' ||s.charAt(i) == '5' ||s.charAt(i) == '6' ||s.charAt(i) == '7'){
                return 0 ;
            }
        }
        return 1;
    }
    public static void Solve(){
        String s = sc.next();
        if(check(s) == 1){
            for(int i = 0 ; i < s.length() ; i++){
                if(s.charAt(i) == '8' || s.charAt(i) == '9'|| s.charAt(i) == '0') s = s.replace(s.charAt(i), '0');
                else s = s.replace(s.charAt(i), '1');
            }
            int check = 0;
            String res = "";
            for(int i = 0 ; i < s.length() ; i++){
                if(s.charAt(i) == '1'){
                    check = 1;
                }
                if(check == 1){
                    res += s.charAt(i);
                }
            }
            if(check!=0) System.out.println(res); 
            else System.out.println("INVALID");       
        }else System.out.println("INVALID");
    }

    public static void main(String[] args) throws Exception {
        int t = sc.nextInt();
        while(t-->0) Solve();
    }
}
