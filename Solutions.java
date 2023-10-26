import java.util.*;
public class Project_01_java {
  public static void main(String args[]) {
    System.out.println("Calculating Percentage of Total Marks");
    Scanner sc = new Scanner(System.in);
    System.out.println("Total Marks");
    float TotalMarks = sc.nextInt();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first Sub Marks");
    float a  = sc.nextInt();

    System.out.println("Enter the second Sub Marks");
    float b  = sc.nextInt();

    System.out.println("Enter the Third Sub Marks");
    float c  = sc.nextInt();

    System.out.println("Enter the fourth Sub Marks");
    float d  = sc.nextInt();


    System.out.println("Enter the fifth Sub Marks");
    float e  = sc.nextInt();

System.out.println("Marks Obtained in all the Subjects");
    float sum  =  ( a + b + c + d + e);
    System.out.println (sum);
     System.out.println (TotalMarks);
      float Percentage = sum * 100 / TotalMarks; 
      System.out.println(Percentage);

  }
}