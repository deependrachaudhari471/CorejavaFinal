import java.util.*;
class IdentityHashMapTest{
  public static void main(String[] args) {
  	IdentityHashMap im = new IdentityHashMap();
  	im.put(10,"Deep");
  	im.put(10,"shekehr"); //Here Buffer Concept Comes  ForInteger Range From 0 to 127 so it gives only one output with override value 
  	im.put(128,"Deep");
  	im.put(128,"shekehr");
  	System.out.println(im);
  }
}