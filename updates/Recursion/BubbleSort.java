class BubbleSort{
  public static void main(String[] args){
    int[] arr = {3,-4,4,-3,34,-1,234,-99,432,-101,586,897,45564};
    bubblesortFunction(arr);
    System.out.println("List after sorting:");
    display(arr);
    System.out.println();
  }
  public static void bubblesortFunction(int[] arr2){
    int length = arr2.length;
    for(int i=0; i<length-1; i++)
      for(int j=0;j<length-i-1;j++){
        if(arr2[j]>arr2[j+1]){
          int temp = arr2[j];
          arr2[j] = arr2[j+1];
          arr2[j+1] = temp;
        }
      }
  }

  public static void display(int[] arr1){
    int length = arr1.length;
    for(int i=0; i<length-1; i++){
      System.out.print(" "+arr1[i]);
    }
  }
}
