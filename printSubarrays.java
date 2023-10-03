public class printSubarrays{
  public static void arrays(int numbers[]){
    int ts =0;
    int sum =0;
    int maxSum = Integer.MAX_VALUE;
    for(int i=0;i<numbers.length;i++) {
      int start=i;
      for(int j=i;j<numbers.length;j++){
        int end =j;
        
          sum=0;
        for(int k=start;k<=end;k++){
          System.out.println(numbers[k] +" ");
            sum =sum +numbers[k];
            
        
        
         
        }
         System.out.println("the sum of this sub array is:"+sum);
        
       
        ts++;
        

      }

               
     System.out.println();
    }
    
     System.out.println("the number of total subarrays is ="+ ts);
    
  }
  public static void main (String args[]){
    int numbers []= {1,2,3,4,5};
    arrays(numbers);
  }
}