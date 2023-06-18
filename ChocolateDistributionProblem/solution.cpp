#include <bits/stdc++.h>
using namespace std;

int chocolateProblem(vector<int>& nums, int m){
    int minDiff = INT_MAX;
    sort(nums.begin(), nums.end());
    for(int i = 0; i+m-1<nums.size(); i++){
        int diff = nums[i+m-1] - nums[i];
        if(diff < minDiff){
            minDiff = diff;
        }
    }
    return minDiff;
}

int main(){
    vector<int> nums = {12, 4,  7,  9,  2,  23, 25, 41, 30,
                  40, 28, 42, 30, 44, 48, 43, 50 };
    int m = 7;
    cout << "Minimum difference is "
         << chocolateProblem(nums, m);
    return 0;
}