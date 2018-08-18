class ColorCode{
	public static void testColor(String s){
		String str = s ;
		int count = 0;
		char val[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		if(str.charAt(0) == '#'){
             char[] strArray = str.toCharArray();
             for(int i = 1;i<strArray.length;i++){
             	for (int j = 0;j<val.length ;j++ ) {
             		if(strArray[i] == val[j]){
             			//System.out.println(strArray[i]);
                       count++;
             		}
             	}
             }

			
		}else{
			System.out.println("InValid");
		}
		if(count == (str.length()-1)){
			System.out.println("Valid Inside");
		}else{
			System.out.println("Invalid Inside");
		}
	}
	
	public static void main(String[] args) {
		testColor("#FF950");
	}
}