class Node{
  int data;
  Node next;
  Node prev;

  public Node(int data){
    this.data = data;
  }

  public void display(){
    System.out.println("Data inside the linked Node is: "+data);
  }
}
