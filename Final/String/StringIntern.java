class StringIntern{
	public static void main(String[] args) {
		String s = "Deependra";
		//String s1 = new String("Deependra");
		String s2 = new String("hello");
		s2.intern();
		String s3 = "hello";
		System.out.println(s2.intern());
		System.out.println(s2.intern()==s3);
		System.out.println(s.intern());
		//System.out.println(s1.intern() == s);
	}
}