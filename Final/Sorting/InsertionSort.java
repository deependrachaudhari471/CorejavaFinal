class InsertionSort{
     static int[] insertionSort(int[] arr){
         int temp ;
         for(int i=1;i<arr.length;i++){
         	for(int j = i ;j> 0;j--){
         		if(arr[j-1] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
         		}
         	}
         }
         return arr;
     }

	public static void main(String[] args) {
		int[] arr = new int[]{9,6,3,1,7,2,0};
		for(int arr1 : insertionSort(arr)){
			System.out.print(arr1+",");
		}
	}
}