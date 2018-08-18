class SplitString{
	public static void main(String[] args) {
		String str = "i am Indian";
		String[] arr = str.split(" ");
		for(int i=(arr.length-1);i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}
}