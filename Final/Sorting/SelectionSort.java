class SelectionSort{
     static int[] selectionSort(int[] arr){
         int temp ;
         for(int i=0;i<arr.length;i++){
         	int minimum = i;
         	for (int j = i+1;j<arr.length ;j++ ) {
         		if(arr[minimum] > arr[j]){
         			minimum = j;
         		}
         	}
         	 temp = arr[minimum];
         	 arr[minimum] = arr[i];
         	 arr[i] = temp;
         }
         return arr;
     }

	public static void main(String[] args) {
		int[] arr = new int[]{9,6,3,1,7,2,0};
		for(int arr1 : selectionSort(arr)){
			System.out.print(arr1+",");
		}
	}
}