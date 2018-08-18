import java.util.*;
class StringDuplicate{
	public static void main(String[] args) {
		String str = "hhelaaalohlloenm";
	    char[] ch = str.toCharArray();
	    int count = 1;
	    HashMap map = new HashMap();
	    for(int i = 0;i<ch.length;i++){
	     	for(int j = 0;j < ch.length;j++){
	    		if(ch[i] == ch[j]){
	    			count++;
	    		}
	    	}
	    	if(count > 1){
	    	map.put(ch[i],count);
	        }
	    	count = 0;
	    }

	    Iterator it = map.entrySet().iterator();
	    while(it.hasNext()){
	    	Map.Entry pair = (Map.Entry)it.next();
	    	System.out.println(pair.getKey()+"..is.."+pair.getValue()+" times");
	    }
	}
}