import java.io.*;
class RunnableDemoException implements Runnable{
    public void run(){
       try{
          int i = 1/0;
          throw new FileNotFoundException(); //Never throws always Handle in  Checked exception can't be thrown, Runnable must 
          //handle checked exception itself. 
       }catch(FileNotFoundException | NullPointerException e){//ParentChild RelationShip not Applicable in multi-Catch
          System.out.println(e);
       }
    }
	public static void main(String[] args) {
		new Thread(new RunnableDemoException()).start();
	}
}