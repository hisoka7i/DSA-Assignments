class BinarySearch{
  public static void main(String[] args){
  int[] arr = {3,4,34,234,432,586,897,45564};
  int l,u,mid,val;
  l=0;
  u=arr.length-1;
  val=345645;
  search(arr, l, u, val);
  }
  public static void search(int[] data, int min_limit, int max_limit, int value){
    int middle1 = (min_limit + max_limit)/2;
    if(min_limit<=max_limit){
      if(value==data[middle1]){
        System.out.println("Data found at position: "+(middle1+1));
        return;
      }
      else if(data[middle1]<value){
        min_limit = middle1+1;
        search(data, min_limit,max_limit,value);
      }
      else{
        max_limit = middle1-1;
        search(data, min_limit,max_limit,value);
      }
    }
      else{
        System.out.println("Data not found");
        return;
      }
  }
}
