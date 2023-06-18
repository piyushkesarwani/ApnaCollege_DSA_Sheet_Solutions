import java.util.*;
import java.lang.*;

class solution {
    public static void main(String args[]) {
        solution obj = new solution();
        int arr [] = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = obj.search(arr, target);
    }
    public int search(int arr[], int target){
        int n = arr.length;
        int high = n - 1;
        int low = 0;
        while(high>low){
            int mid = (high+low)/2;
            if(arr[mid] > arr[high]){
                low = mid + 1;
            }else {
                high = mid;
            }
        }
        int rot = low;
        low = 0; high = n-1;
        while(high>=low){
            int mid = (high+low)/2;
            int realmid = (mid+rot)%n;
            if(arr[realmid] == target){
                return realmid;
            }else if(arr[realmid] < target){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
}