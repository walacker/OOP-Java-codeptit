import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        //Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Scanner in = new Scanner(System.in);
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}

class LoaiPhong implements Comparable<LoaiPhong>{
        private String line,name;

        public LoaiPhong() {
        }

        public LoaiPhong(String s){
            this.line = s ;
            this.name = s.trim().split("\\s+")[1];
        }

        public String getName(){
            return this.name;
        }

        @Override
        public String toString() {
            return line;
        }

        @Override
        public int compareTo(LoaiPhong other) {
            return this.name.compareTo(other.name);
        }
        
}
