import java.util.*;
import java.lang.*;

class solution {

    public boolean containsDuplicate(int nums[]){
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        solution obj = new solution();
        int arr[] = {1,1,1,3,3,4,3,2,4,2};
        boolean ans = obj.containsDuplicate(arr);
        System.out.println(ans);
    }
}