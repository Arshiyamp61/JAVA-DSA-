public class Classroom{
  public static int Knapsack(int val[],int wt[],int W,int n,int dp[][]){
    if(W==0||n==0){
      return 0;
    }
    if(dp[n][W]!=-1){
      return dp[n][W];
    }
    if(wt[n-1]<=W){
      int ans1 = val[n-1]+knapsack(val,wt,W-wt[n-1],n-1,dp);
      int ans2 = knapsack(val,wt,W,n-1,dp);
      dp[n][W]=math.max(ans1,ans2);
      return dp[n][W];
    }
    else {
      dp[n][W]=Knapsack(val,wt,W,n-1,dp);
      return dp[n][W];
    }
  }
    public static void main (String args[]){
      int val[]={15,14,10,45,30};
      int wt[] = {2,5,1,3,4};
      int W = 7;
      System.out.println(Knapsack( val,wt,W,val.length));
    }
  }
  
