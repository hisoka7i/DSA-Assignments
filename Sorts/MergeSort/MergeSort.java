class MergeSort{

public static void divide(int[] arr, int l, int r){
	if(l>=r)return;
	
	int mid = l + (r-l)/2;
	divide(arr,l,mid);
	divide(arr,mid+1,r);
	concure(arr,l,mid,r);
}

public static void concure(int[] arr, int l, int m, int r){
	int[] merge = new int[r-l+1];
	int lIndex = l;
	int rIndex = m+1;
	int x=0;
	while(lIndex<=m && rIndex>=r){
		if(arr[lIndex]<=arr[rIndex]){
			merge[x++] = arr[lIndex++];
		}
		else{
			merge[x++] = arr[rIndex++];
		}
	}
	while(lIndex<=m){
		merge[x++] = arr[lIndex++];
	}
	while(rIndex<=r){
		merge[x++] = arr[rIndex++];
	}
	
	for(int i=0, j=l; i<merge.length; i++,j++){
		arr[j]=merge[i];
	}
}

public static void main(String[] args){
	int[] arr = {9,0,-1,3};
	divide(arr,0,3);
}
}