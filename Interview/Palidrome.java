public class Palidrome {
    public static boolean isPalindrome(String word) {
        String reverse = "";
       
        for(int i= word.length()-1;i>=0;i--){
            reverse = reverse+word.charAt(i);
        }
      
        if(reverse.toUpperCase().equals(word.toUpperCase())){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(Palidrome.isPalindrome("Deleveled"));
    }
}