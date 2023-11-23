// import java.util.*;
// public class StackP {
//   public static void pushAtBottom(Stack<Integer> s , int data){
//     if (s.isEmpty()) {
//       s.push(data);
//       return;
//     }
//     int top = s.pop();    
//     pushAtBottom(s, data);
//     s.push(top);

//   }
//   public static void reverseStack(Stack<Integer>s){
//     if(s.isEmpty()){
//       return;
//     }
//     int top = s.pop();//3-2-1
//     reverseStack(s);
//     pushAtBottom(s, top);
//   }

//   public static void printStack(Stack<Integer>s){
//     while (!s.isEmpty()) {
//       System.out.println(s.pop());
      
//     }
//   }

//   public static void main(String args[]){
//     Stack<Integer> s = new Stack<>();
// s.push(1);//3
// s.push(2);//2
// s.push(3);//1

// while(!s.isEmpty()){
//   System.out.println(s.pop());
// }

// // printStack(s);
// reverseStack(s);
// printStack(s);

//   }

// }


import java.util.*;
//Code to Reverse a Stack

public class StackP{
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int temp = s.pop();
        pushAtBottom(s, data);
s.push(temp);
    }

    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        reverse(stack);
        

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());

        }
       
    
    }
}