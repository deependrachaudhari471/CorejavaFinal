import java.util.*;
class MaxInteger{
	 public static int checkMax(String s){
			int res = 0;
			ArrayList list = new ArrayList();
			for (int i = 0; i < s.length(); i++) {
				if(Character.isDigit(s.charAt(i))){
					res =  res*10+(Integer.parseInt(String.valueOf(s.charAt(i))));
					list.add(res);
				}else{
					res = 0;
				}
			}
			return Integer.parseInt(String.valueOf(Collections.max(list)));
	   }
	public static void main(String[] args) {
		String s = "ac123hkm92ab956231m658jfhf8989fgfg";
		System.out.println(checkMax(s));
	}
}