import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void selecSort(int a[], int n){
	for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            if (a[i] > a[j]) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
		System.out.printf("Buoc %d: ", i+1);
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
        selecSort(a, n);
    }
}


