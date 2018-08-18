class PrimeNumbers{
	public static void main(String[] args) {
		String prime="";
		int count = 0;
		for(int i=2;i<50;i++){
			 for (int j=i;j>=1 ;j-- ) {
			 	if(i%j == 0){
			 		count++;
			 	}
			 }
			 if(count == 2){
                 prime = prime+i+" ";
			 }
			 count = 0;
		}
		System.out.println(prime);
	}
}