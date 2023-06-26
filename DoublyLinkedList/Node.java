class Node{
    Student data;
    Node next;
    Node previous;

    public Node(Student data){
      this.data=data;
    }

    public void display(){
      System.out.println(data);
  }
}
