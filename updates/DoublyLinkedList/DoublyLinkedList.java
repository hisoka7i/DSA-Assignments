import java.util.Scanner;
class DoublyLinkedList{
  Node head, tail;
  Scanner sc = new Scanner(System.in);

  public DoublyLinkedList(){
    head=null;
    tail=null;
  }

  public void insertFirst(){
    System.out.println("Enter the Roll number and then Name of the Student:");
    Student s1 = new Student(sc.nextInt(), sc.next());
    Node newNode = new Node(s1);
    if(head==null){
      head=newNode;
      tail=newNode;
      return;
    }
    newNode.next = head;
    head.previous = newNode;
    head=newNode;
  }

  public void insertAtLast(){
    System.out.println("Enter the Roll number and then Name of the Student:");
    Student s1 = new Student(sc.nextInt(), sc.next());
    Node newNode = new Node(s1);
    if(head==null){
      head=newNode;
      tail=newNode;
      return;
    }
    tail.next=newNode;
    newNode.previous=tail;
    tail=newNode;
  }

  public void insertAtPos(){
    System.out.printf("%nEnter the position that you wish to enter: ");
    int pos=sc.nextInt();
    if(pos==1){
      insertFirst();
      return;
    }
    System.out.println("Enter the Roll number and then Name of the Student:");
    Student s1 = new Student(sc.nextInt(), sc.next());
    Node newNode = new Node(s1);
    Node temp = head;
    int count = 1;
    while(count!=pos-1){
      temp=temp.next;
      count++;
      if(temp==null){
        System.out.println("Wrong Position entered!!!!");
        return;
      }
    }
    newNode.next=temp.next;
    temp.next.previous=newNode;
    newNode.previous=temp;
    temp.next=newNode;
  }

  public void deleteFirst(){
    if(head==null){
      System.out.println("Underflow Condition");
      return;
    }
    head = head.next;
    head.previous = null;
  }

  public void deleteLast(){
    if(head==null){
      System.out.println("Underflow Condition");
      return;
    }
    tail = tail.previous;
    tail.next=null;
  }

  public void deleteAtPos(){
    System.out.printf("%nEnter the position that you wish to enter: ");
    int pos=sc.nextInt();
    if(pos==1){
      deleteFirst();
      return;
    }
    Node temp = head;
    int count = 1;
    while(count!=(pos-1)){
      temp=temp.next;
      if(temp==null){
        System.out.println("Wrong input!!!");
        return;
      }
    }
    temp.next.next.previous = temp;
    temp.next = temp.next.next;
  }

  public void reverseDisplay(){
    Node temp = tail;
    while(tail!=null){
      tail.display();
      tail=tail.previous;
    }
  }

  public void displayAll(){
    Node temp = head;
    while(temp!=null){
      temp.display();
      temp=temp.next;
    }
  }
}
