class StringTest{
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Deependra");
		String s2 = new String("Deependra");
		//String s3  = s1.toUpperCase();
		//s1.append("Hello");
		System.out.println(s1);
		//System.out.println(s3);
		//System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}
}