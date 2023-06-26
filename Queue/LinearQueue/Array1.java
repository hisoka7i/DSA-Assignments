class Array1{
  int[] queue;
  int front,rear;
  int size = 0;

  public Array1(int data){
    queue = new int[data];
    front=rear=-1;
    size = queue.length;
  }

  boolean isEmpty(){
    if(rear==-1){
      return true;
    }
    return false;
  }

  boolean isFull(){
    if(rear==size-1 && front==0 || front==rear+1){
      System.out.println("Queue is full!!!");
      return true;
    }
    return false;
  }

  void enqeue(int data){
    if(isFull()){
    return;
    }
    if(isEmpty()){
      System.out.println("Queue is empty!!!");
      front = 0;
    }
    System.out.println("Data inserted:");
    queue[(++rear)%size] = data;
  }

  void dequeue(){
    if(isEmpty()){
      System.out.println("Queue is empty: ");
    }
    System.out.println("Deleted data is: "+queue[++front%size]);
    if(front==rear+1){
      front=rear=-1;
    }
  }
}
