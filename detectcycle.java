public class detectcycle {
  public static class  Node {
    int data;
    Node next;

    public  Node (int data){
this.data= data;
this.next=null;
    }
  }
public static Node head;
public static Node tail;

public void   addFirst(int data){
  Node newNode = new Node(data);
  if(head==null){
    head=tail=newNode;
    return;
  }
  newNode.next = head;
  head = newNode;

}
public void addLast(int data){
  Node newNode = new Node(data);
  if(head==null){
    head=tail=newNode;
    return;
  }
  tail.next= newNode;
  tail = newNode;
}
public void print(){
  Node temp = head;
  if(head==null){
    System.out.println("LL is Empty");
    return;
    
  }
  while(temp == null){
    System.out.println(temp.data+"");
    temp = temp.next;

  }
  System.out.println();

}

public static boolean isCycle(){
  Node slow = head;
  Node fast = head;
  while(fast !=null && fast.next !=null){
    slow = slow.next;
    fast = fast.next.next;
    if(slow ==fast){
      return true;
    }

  }
  return false;
}

public static void main(String args[]){
  detectcycle ll = new detectcycle()
;
head = new Node(1);
head.next = new Node(2);
head.next.next = new Node(3);


System.out.println(isCycle());
}

}
