import java.util.Scanner;
class Stack{
  int top=-1;
  char[] stackk;
  public Stack(int length){
    stackk = new char[length];
  }

  void pop(){
    if(top==-1){
      return;
    }
    top--;
  }

  void push(char ch){
    if(top==stackk.length-1){
      return;
    }
    else stackk[++top]=ch;
  }

  void check(char ch){
    if(top==-1){push(ch);}
    int temp = top;
    // System.out.println(top);
    // System.out.println(ch==')');
    if((stackk[top]=='{' && ch=='}') || (stackk[top]=='(' && ch==')') || (stackk[top]=='[' && ch==']')){
      pop();
      return;
    }


    while(temp>-2){
      if(temp==-1){break;}
      if((stackk[temp]=='{' && ch=='}') || (stackk[temp]=='(' && ch==')') || (stackk[temp]=='[' && ch==']')){break;}
      temp--;
    }
    temp=temp+1;
    if(temp==-1){
      push(ch);
      return;
    }
    else{
      for(int i=temp; i<top; i++){
        stackk[temp]=stackk[temp+1];
      }
      top=top-1;
      return;
    }
    }
}


class Parenthesis{
  public static void main(String ars[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Parenthesis String!!Only");
    String str = scan.next();

    int length = str.length();

    Stack str1 = new Stack(length);

    int i = 0;

    while(i<length){
      if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='['){
        str1.push(str.charAt(i));
        i++;
      }
      else{
        str1.check(str.charAt(i));
        i++;
      }
    }
    System.out.println(str1.top);
    if(str1.top==-1){
      System.out.println("This is a balanced paranthesis");
    }
    else{
      System.out.println("This is not a balanced Parenthesis");
    }
  }
}
