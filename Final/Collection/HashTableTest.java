import java.util.*;
class HashTableTest{
  public static void main(String[] args) {
  	Hashtable h = new Hashtable();
  	h.put(new Test(5),"A");
  	h.put(new Test(21),"Q");
  	h.put(new Test(15),"W");
  	h.put(new Test(9),"A");
  	h.put(new Test(6),"G");
  	h.put(new Test(5),"X");
  	System.out.println(h);
  }
}
class Test{
	int i ;
	Test(int i){
		this.i = i;
	}

	public int hashCode(){
		return i;
	}
	public boolean equals(Object obj){
        if(obj instanceof Test){
		Test t = (Test)obj;
		   return this.i == t.i;
	    }else{
           return false;
	  }
	}
    
    public String toString(){
    	return i+" ";
    }


}