#include <vector>
#include <bits/stdc++.h>
using namespace std;

void reverse(vector<int>& arr, int n){
  int start = 0, end = n-1;
  while(start <= end){
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
  }
}

int main(){
  // int n;
  // cout<<"Enter the size of the array"<<endl;
  // cin>>n;
  // int arr[n];
  // cout<<"Enter array Elements"<<endl;
  // for(int i = 0; i<n; i++){
  //   cin>>arr[i];
  // }   
  vector<int> arr = {1,4,5,6,7};
  int n = arr.size();
  reverse(arr, n);
  cout<<"The reverse of an array ->"<<endl;
  for(int i = 0; i<n; i++){
    cout<<arr[i];
  }
  return 0;
}