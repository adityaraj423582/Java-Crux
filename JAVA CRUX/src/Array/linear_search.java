package Array;
import java.util.*;
public class linear_search {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int item = sc.nextInt();
    }

public static int Search(int [] arr , int item){
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] == item){
            return i;
        }
    }
    return -1;
}





    }

