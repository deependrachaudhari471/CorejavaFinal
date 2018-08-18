import java.io.*;
class PrintWithoutSOP{
	public static void main(String[] args)throws Exception {
        System.err.print("Hello \n");
		System.out.write("Hello Deependra \n".getBytes());
		PrintStream out = new PrintStream(new FileOutputStream(FileDescriptor.out));
		out.print("Hello Stream \n");
		System.out.format("%s","Format Print");

	}
}