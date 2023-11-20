import java.util.*;
public class StackP {
  public static void pushAtBottom(Stack<Integer> s , int data){
    if (s.isEmpty()) {
      s.push(data);
      return;
    }
    int top = s.pop();    //321 123
    pushAtBottom(s, data);//
    s.push(top);//321

  }
  public static void reverseStack(Stack<Integer>s){
    if(s.isEmpty()){
      return;
    }
    int top = s.pop();//3-2-1
    reverseStack(s);
    pushAtBottom(s, top);
  }

  public static void printStack(Stack<Integer>s){
    while (!s.isEmpty()) {
      System.out.println(s.pop());
      
    }
  }

  public static void main(String args[]){
    Stack<Integer> s = new Stack<>();
s.push(1);//123
s.push(2);
s.push(3);

while(!s.isEmpty()){
  System.out.println(s.pop());
}
printStack(s);
reverseStack(s);
printStack(s);


  }
}



