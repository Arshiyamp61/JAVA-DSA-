public class maxSum{
  public static void Maximum(int numbers[]){
    int currSum=0;
    int maxSum=Integer.MIN_VALUE;
    for( int i=0;i<numbers.length;i++){
       int start =i;
      for(int j=i;j<numbers.length;j++){
         int end =j;
         currSum=0;
        for(int k=start;k<=end;k++){
          System.out.print(numbers[k]);
System.out.println();
          currSum =  currSum+ numbers[k];
        }
        System.out.println(" ");
        System.out.println(currSum);
          if(maxSum<currSum){
            maxSum=currSum;
            
          }
          System.out.println();
        }
        System.out.println();
      }
      System.out.println ( "the maximum sum is " +maxSum);
    }
  
  public static void main (String args[]){
    int numbers[]={1,2,3,4,5};
    Maximum(numbers);
  }
}