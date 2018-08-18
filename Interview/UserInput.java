class TextInput{
    char[] arr = new char[5];
    int i = 0;
    public void add(char c){
         arr[i] = c;
         i++;
     } 
    public void getValue(){
      for(char a:arr){
      	if(Character.isDigit(a)){
      	System.out.printk(a);
      }
      }
    }
}




public class UserInput {
    
   

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('9');
       input.getValue();
    }
}