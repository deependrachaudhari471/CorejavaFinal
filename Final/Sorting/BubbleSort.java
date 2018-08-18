import java.util.*;
class BubbleSort{
    static int[] bubbleSort(int[] arr){
    	int temp = 0;  
         for(int i=0; i < arr.length; i++){  
                 for(int j=1; j < ( arr.length); j++){  
                          if(arr[j-1] > arr[j]){                            
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
       
    	return arr;
    } 

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter The size Of An Array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter The Elements Of An Array : ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}

		for(int arr1 : arr){
			System.out.println(arr1);
		}
		for(int arr1 : bubbleSort(arr)){
			System.out.println(arr1);
		}
	}
}