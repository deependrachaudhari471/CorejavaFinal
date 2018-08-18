class Remove10s{
	public static void main(String[] args) {
		int[] arr = new int[]{20,10,10,50,1,3};
		for (int i = 0;i<arr.length ;i++ ) {
			if(arr[i] == 10){
				arr[i] = 0;
			}
		}
		for (int arr2 :arr) {
			System.out.println(arr2);
		}
	}
}