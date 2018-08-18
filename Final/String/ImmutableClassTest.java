public final class ImmutableClassTest{
    private final int id;
    private final String name;
    
     public ImmutableClassTest(int id,String name){
     	this.id = id;
     	this.name= name;
     }
    public int getId(){
    	return id;
    }
    public String getName(){
    	return name;
    }
    public static void main(String[] args) {
    	String s = "Deependra";
    	int i = 10;
    	ImmutableClassTest im = new ImmutableClassTest(i,s);
    	System.out.println(im.getId());
    	System.out.println(im.getName());

    	System.out.println("___After Change___");
        //Change The Local Value
        i=20;
        s="Rahul";
        System.out.println(im.getId());
    	System.out.println(im.getName());

    }
}