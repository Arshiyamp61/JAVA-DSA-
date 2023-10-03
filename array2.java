import java.util.*;
public class array2{
  public static void  update(int marks[]){
    for(int i=0;i<marks.length;i++){
      marks[i] = marks[i]+1;
    }
  
  }

  public static void main (String args[]){
    int marks []={97,98,96};
    System.out.println(update (marks));

  }

}