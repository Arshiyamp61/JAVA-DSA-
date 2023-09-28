public class linearSearch{


  public static int search(int numbers[],int key){
    for(int i=0;i<numbers.length;i++){
      if(numbers[i]==key) {
        return i;
      }
    }
    return -1;
  }
  public static void main (String args[]){
    int numbers[]={1,2,5,4,88,77,95,95,7};
    int key = 7;
    int index  =search(numbers,key);
    if(index==-1){
      System.out.println("key not found");
    } else {
      System.out.println("key  found");
    }
  }
}