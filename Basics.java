import  java.util.*;
public class Basics {
  public static void Name(int i,int n){
    
    if(i>n)
    {
      return ;
    }
    
    System.out.println("Arshiya");
    Name(i+1,n);
  
  }
   
  public static void main (String args[]){
    
    Name(1,8);
  }
}

//https://api.openweathermap.org/data/3.0/onecall?lat={lat}&lon={lon}&exclude={part}&appid={API key}
