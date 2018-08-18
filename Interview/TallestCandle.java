import java.util.*;
class TallestCandle{
	 public static void  candlesBlow(int arr[]){
        int max = arr[0];
        int count = 0;
        for(int i=0; i<arr.length;i++ ) {
        	if(max > arr[i]){
        	}else{
        		max = arr[i];
        	}
        }
        for (int i = 0;i<arr.length ;i++ ) {
        	if(max == arr[i]){
        		count++;
        	}
        }
        System.out.println("Tallest Candle : "+ max + " and you can blow only :"+count+" candels");
         
	 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entter The age : ");
		int age = sc.nextInt();
		int[] arr = new int[age];
        System.out.println("Enter the Array Elemnts : "+age);
         for(int i=0;i<age;i++){
         	arr[i] = sc.nextInt(); 
         }
		candlesBlow(arr);
	}
}