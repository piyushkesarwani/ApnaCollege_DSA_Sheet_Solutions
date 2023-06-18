import java.util.*;
import java.lang.*;

class solutionPiyush {
    public int subarray(int nums[]) {
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            sum = nums[i];
            max = Math.max(sum, max);

            if(sum < 0)
            {
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String args[]) {
        solutionPiyush obj = new solutionPiyush();
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int max = obj.subarray(arr);
        System.out.println("The sum of maximum subarray is ->" + max);
    }
}