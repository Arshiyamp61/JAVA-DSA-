  
  
  public class powerProblem{
  public static int power(int a , int n){
    if(n==0){
      return 1;
    }
int halfPower = power(a,n/2);
int  finalAns = halfPower*halfPower;


if(n % 2 !=0){
  finalAns = a *halfPower*halfPower;

}
return finalAns;

  }
  public static void main (String args[]){
    System.out.print(power(2,5));
  }
}