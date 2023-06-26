class Longest_increasing_subarray{
  public static void main(String[] arg){
    int[] arr = {23,1,2,3,4,5,6,7,8,9,23,3,5,6,7,10,1};
    int count = 0;
    for(int i=0;i<arr.length-1;i++){
      int j = i;
      int new_count = 0;
      while(arr[j+1]>arr[j]){
        if(j+1==arr.length-1){
          break;
        }
        new_count++;
        j++;
      }
      if(new_count>count){
        count = new_count;
      }
    }
    System.out.println("Length of the longest subarray is: "+(count+1));
  }
}
