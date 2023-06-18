import java.util.*;
import java.lang.*;
class solution {
    public int maxNumber(int arr[], int n){
        int max = arr[0];
        for(int k = 0; k<n; k++){
            if(arr[k] > max){
                max = arr[k];
            }
        }
        return max;
    }
    public int minNumber(int arr[], int n){
        int min = arr[0];
        for(int k = 0; k<n; k++){
            if(arr[k] < min){
                min = arr[k];
            }
        }
        return min;
    }
    public static void main(String args[]){
        solution obj = new solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int maximumElement = obj.maxNumber(arr, n);
        int minimumElement = obj.minNumber(arr, n);
        System.out.println("Maximum element = " + maximumElement);
        System.out.println("Minimum element = " + minimumElement);
    }
}