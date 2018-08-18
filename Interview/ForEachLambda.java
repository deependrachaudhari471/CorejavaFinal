import java.util.*;
class ForEachLambda{
	public static void main(String[] args) {
		Map<String,String> h = new HashMap<String,String>();
		h.put("abc","Hello");
		h.put("ab3","Hello");
		h.put("ab2","Hello");
        
        Iterator it = h.entrySet().iterator();
        while(it.hasNext()){
        	Map.Entry pair = (Map.Entry)it.next();
        	System.out.println(pair.getKey()+"---"+pair.getValue());
        }

        //ForEach Loop
        Set s = h.entrySet();
        for(Map.Entry<String,String> p : h.entrySet()){
        	System.out.println(p.getKey()+"---"+p.getValue());
        }

        //Using Lembda Expression
        h.forEach((k,v)->System.out.println("Item : "+k +" Count :"+v));
	}
}