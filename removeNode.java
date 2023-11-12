public class removeNode {
public  static class Node{
  int data;
  Node next;
  public Node(int data){
    this.data = data;
    this.next =null;
  }

}
public static Node head;
public static Node tail;



  public void delete(int n){
    int size = 0;
    Node temp = head;
    while(temp!=null){
      temp = temp.next;
      size++;
    }
    if(n==size){
      head = head.next;
      return;
    }

    int i = 1;
    int find = size - n;
    while(i<find){
      prev = prev.next;
      i++;
    }
    prev.next = prev.next.next;
    return;
  }
}
