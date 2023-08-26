///NguyenNhatMinhE21CN4/// 

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        array = eliminateDuplicates(array);
        for (int e : array) {
            System.out.printf("%d ", e );
        }
        System.out.println();
    }

    private static int[] eliminateDuplicates(int[] list) {
        Set<Integer> set = new HashSet<>();
        for (int e : list) {
            set.add(e);
        }
        int[] newArray = new int[set.size()];
        int index = 0;
        for (Integer e : set) {
            newArray[index] = e;
            index++;
        }
        return newArray;
    }
}
