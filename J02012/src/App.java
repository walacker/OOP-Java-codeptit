import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void insertionSort(int a[], int n){
        for (int i = 0; i < n; i++) {
            int id = i; 
            while (id > 0 && a[id] < a[id - 1]) {
                int tmp = a[id];
                a[id] = a[id - 1];
                a[id - 1] = tmp;
                id--;
            }
		System.out.printf("Buoc %d: ", i);
		for(int j= 0; j <= i; j++){
			System.out.printf("%d ", a[j]);
		}
        
		System.out.println();
	}
}

    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i){
            a[i] = sc.nextInt();
        }
        insertionSort(a, n);
    }
}


