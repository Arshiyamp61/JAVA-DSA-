import java.util.*;
public class catalanTab {
  public static int catalanTabulation(int n ){
    int dp[] = new int [n+1];
     dp[0]=1;
     dp[1]= 1;
    for(int i=2;i<=n;i++){
      for(int j=0;j<i;j++){
        dp[i]+=dp[i-j-1];
      }
    }
    return dp[n];
  }
  public static void main (String args[]){
    System.out.println(catalanTabulation(4));
  }
}