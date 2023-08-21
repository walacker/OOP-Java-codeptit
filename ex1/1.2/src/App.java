///NguyenNhatMinhE21CN4/// 

import java.util.Scanner;

class App {
    static Scanner sc = new Scanner(System.in);
    
    //Creat array from string
    public static char[] creatArray(String s){
        char[] arr = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    //Display array
    public static void displayArray(char[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Count the number of letters in the string
    public static int[] countLetters(char[] arr){
        int[] cnt = new int[26];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 'a' && arr[i] <= 'z'){
                cnt[arr[i] - 'a']++;
            }
        }
        return cnt;
    }

    //Display the number of letters in the string
    public static void displayCounts(int[] countLetters){
        for(int i = 0; i < countLetters.length; i++){
            if(countLetters[i] != 0){
                System.out.println((char)(i + 'a') + " appears " + countLetters[i] + " times");
            }
        }
    }

    public static void main(String[] args){
        String s = sc.nextLine();
        char[] arr = creatArray(s);
        displayArray(arr);
        
        int[] cnt = countLetters(arr);
        displayCounts(cnt);
    }
}
