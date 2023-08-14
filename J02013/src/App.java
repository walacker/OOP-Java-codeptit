import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void BubbleSort(int a[], int n){
        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
            if (isSorted) {
                return;
            }
		    System.out.printf("Buoc %d: ", i + 1);
		for(int j= 0; j < n; j++){
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
        BubbleSort(a, n);
    }
}


