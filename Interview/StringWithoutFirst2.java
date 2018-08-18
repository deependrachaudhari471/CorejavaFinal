class StringWithoutFirst2{
	public static void test(String s){
         String str = s;
         if(str.charAt(0)=='j'){
               	System.out.println(str.charAt(0));
               	
               } 
                if(str.charAt(1)=='b'){
               	System.out.println(str.charAt(1));
               	
               } 
         for(int i=0;i<=s.length();i++){

               if(i >= 2){
               	System.out.println(str.charAt(i));
               }

         }
	}
	public static void main(String[] args) {
		test("jbva");
	}
}