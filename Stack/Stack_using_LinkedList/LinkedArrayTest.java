class LinkedArrayTest{
  public static void main(String[] args){
    LinkedArray l1 = new LinkedArray();
    System.out.println("Entering data into the stack>>");
    l1.push(34);
    l1.push(33);
    l1.push(32);
    l1.push(31);
    l1.push(30);
    System.out.println("Showing the top element!!!");
    l1.peek();
    System.out.println("Processing pop() method>>>");
    l1.pop();
    System.out.println("Top element after pop() operation>>>>");
    l1.peek();
  }
}
