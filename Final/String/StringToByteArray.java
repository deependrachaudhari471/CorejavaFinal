import java.util.*;
class StringToByteArray{
	public static void main(String[] args) {
		String s = "Deependra";
		byte[] bytArray = s.getBytes();
		System.out.println(Arrays.toString(bytArray));
		byte[] byte1 = {68, 101, 101, 112, 101, 110, 100, 114, 97};
		String s1 = new String(byte1);
		System.out.println(s1);
	}
}