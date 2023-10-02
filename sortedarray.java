// public class sortedarray{

//   public static boolean sorted(int arr[],int n){
//    for(int i=0;i<arr.length;i++){
//     if(arr[i] >arr[i+1]){
//    return false;
//   }
//    } return true;
//   }
//   public static void main(String args[]){
//     int arr[]={23,43,56,78,1,9};
//     int n=6;
//     System.out.println(sorted(arr,n));
//   }
// }


// class Solution {
//     public boolean check(int[] nums) {
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>nums[(i+1)%nums.length]) count++;
//         }
//         if(count>1) return false;
//         else return true;
//     }
// }



public class sortedarray{
  static  boolean sorted(int nums[]){
    int  count=0;
    for(i=0;i<nums.length;i++){
      if(nums[i]>nums[(i+1)%nums.length]){
        count++;
      }
      if(count>1){
return false;
      }else {
    
    return true;
      }
  
  public static void main(String args[]){
    int nums []={23,54,7,6,8};
    sorted(nums);
  }
}