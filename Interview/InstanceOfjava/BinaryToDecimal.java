class BinaryToDecimal{
	public static void main(String[] args) {
		String binary = "101";
		System.out.println("Decimal : "+Integer.parseInt(binary,2));
		System.out.println("Binary : "+Integer.toBinaryString(Integer.parseInt(binary,2)));
	}
}