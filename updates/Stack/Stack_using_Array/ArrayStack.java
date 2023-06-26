class ArrayStack{
  int[] stack;
  public ArrayStack(){
    stack = new int[10];
  }
  int top = -1;

  void push(int data){
    stack[++top] = data;
  }
  boolean isFull(){
    if(top==stack.length-1)return true;
    return false;
  }
  boolean isEmpty(){
    if(top==-1)return true;
    return false;
  }
  void pop(){
    if(isEmpty()){
      System.out.println("Under-Flow Condition");
      return;
    }
    top--;
  }
  void peek(){
    System.out.println("Top of the stack is "+stack[top]);
  }
}
