import java.util.*;
public class array1{
  public static void main(String args[]){

    int marks[]=new int[5];
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the Physics Marks");
     marks[0]= sc.nextInt();
    System.out.println("Enter the Chemistry Marks");   
     marks[1]= sc.nextInt();
    System.out.println("Enter the Maths Marks");
     marks[2]= sc.nextInt();

     marks[2]= 33;

    int totalPercent = ((marks[0]+marks[1]+marks[2])/3);
    System.out.println("You have secured "+totalPercent);
  }
}