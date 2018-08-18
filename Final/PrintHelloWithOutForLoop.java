class PrintHelloWithOutForLoop{
	 static int i = 0;
     static void m(){
         
     	if(i<10){
     	System.out.println("Hello");
          i++;
           m();
        }
       
     }
	public static void main(String[] args) {
		m();
	}
}