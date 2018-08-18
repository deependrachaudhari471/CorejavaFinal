class RegularInnerClass{
	int i = 10;
    static int k = 30;
	class InnerTest{
		int j = 20;
		static final int l = 30;
       void m(){
       	System.out.println(j+ " :Hello: "+i + "....."+k + "....."+l);
       }
	}
	public static void main(String[] args) {
		//RegularInnerClass r = new RegularInnerClass();
		RegularInnerClass.InnerTest i1 = new RegularInnerClass().new InnerTest();
		i1.m();
	}
}