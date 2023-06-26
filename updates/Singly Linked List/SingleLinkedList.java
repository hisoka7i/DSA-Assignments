class SingleLinkedList{
  Node head;
  int count;
  public SingleLinkedList(){
    head = null;
  }


  public void insertFirst(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }


  public void insertLast(int data){
    Node newNode = new Node(data);
    Node temp = head;
    while(temp.next!=null){
      temp=temp.next;
    }
    temp.next = newNode;
    newNode.next=null;
  }

  public void insertAtPos(int pos, int data){
    Node newNode = new Node(data);
    Node current = head;
    Node prev = null;
    int count  = 0;
    if(pos==1){
      insertFirst(data);
    }
    pos = pos-1;
    while(count!=pos){
      prev = current;
      current = current.next;
      if(current==null){
        return;
      }
      count++;
    }
    newNode.next = current;
    prev.next = newNode;
  }

  public void deleteFirst(){
    Node temp = head;
    head=head.next;
    temp.next = null;
  }

  public void deleteAtPos(int pos){
    Node temp = head;
    int i = 1;
    if(pos==1){
      deleteFirst();
    }
    while(i!=pos-1){
      temp = temp.next;
      i++;
    }
    Node t = temp.next;
    temp.next = temp.next.next;
    t.next = null;
  }


  public void displayAll(){
    Node temp = head;
    while(temp!=null){
      temp.display();
      temp=temp.next;
    }
  }

  public void lengthList(){
    count=0;
    Node temp = head;
    while(temp!=null){
      count++;
      temp=temp.next;
    }
    System.out.println("Length of the Linked List is: "+count);
  }

  public void removeDuplicates(){
    Node temp = head;
    for(int i=1;i<=count; i++){
      //if(temp2==null)return;

      int j = i+1;
      Node temp2 = temp.next;
      while(true){
        if(temp2==null)break;
        if(j==count){break;}
        if(temp.data == temp2.data){
          deleteAtPos(j);
          temp2 = temp.next;
          continue;
        }
        else{
          j++;
          temp2=temp2.next;
        }
      }
      temp = temp.next;
      if(temp==null)return;
    }
  }

  public void mergeTwo(SingleLinkedList s2, SingleLinkedList s1){
    Node temp = s1.head;
    Node temp2 = s2.head;
    int count = 2;
    while(temp!=null){
      if(count%2==0){
        insertAtPos(count, temp2.data);
        temp2=temp2.next;
        if(temp2==null)break;
      }
      count++;
      temp=temp.next;
    }
  }

  public void searchElement(int user_data){
    Node temp = head;
    int pos = 1;
    while(temp!=null){
      if(temp.data == user_data){
        System.out.println("Data found at position: "+(pos));
        break;
      }
      temp=temp.next;
      pos++;
    }
  }

  public void palindrome(){
    Node temp = head;
    Node temp2 = head;
    Node temp3 = null;
    int i=1;
    lengthList();

    Node prev=null, current=temp2, forward=null;
    while (current!=null) {
      forward=current.next;
      current.next=prev;
      prev=current;
      current=forward;
    }
    temp3=prev;

    // while(temp3!=null){
    //   System.out.println(temp3.data);
    //   temp3 = temp3.next;
    // }

    while(temp!=null && temp3!=null){
      System.out.println(temp3.data);
      if(temp.data != temp3.data){
        System.out.println("Not a palindrome:");
        return;
      }
      temp = temp.next;
      temp3 = temp3.next;
    }
    System.out.println("This is a palindrome");
  }



int counter = 1;
  Node searchRec(Node s1){
    if(s1!=null){
      counter++;
      //if(counter == pos){
      System.out.println(s1.data);
      searchRec(s1.next);
        return s1;
      //}
    }
    System.out.println("Invalid position!!!");

    return null;
  }



  public void findMiddle(){
    lengthList();
    int i = 1;
    Node temp = head;
    while(i<(count/2)){
      temp=temp.next;
      i++;
    }
    System.out.println("Middle Element is:"+temp.data);
  }

  public void reverse(){
    // Node prev = head;
    // Node current = head;
    // Node forward = head;
    //
    // while(forward!=null){
    //   forward = forward.next;
    //   current.next = prev;
    //   prev=current;
    //   current=forward;
    // }
    // head = prev;

    Node prev=null, current=head, forward=null;
    while (current!=null) {
      forward=current.next;
      current.next=prev;
      prev=current;
      current=forward;
    }
    head=prev;
  }
}
