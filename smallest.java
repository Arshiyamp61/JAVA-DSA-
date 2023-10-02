import java.util.*;
public class smallest{
  
  public static int getSmallest(int number[]){
    int Smallest = Integer.MAX_VALUE;
    for( int i=0;i<number.length;i++){
      if(Smallest>number[i]){
        Smallest=number[i];
      }
    }
return Smallest;
  }
  public static void main (String args[]){
    int number[]={1,2,3,5,8,99,51,6};
    System.out.println(getSmallest(number));
  }
}