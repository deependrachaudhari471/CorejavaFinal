class ReturnWithTryCatch{
	int calc(){    
      /* try 
       {
         return 1;
       } catch (Exception e){}
     return 10; 
    System.out.println("End of the method"); // Error : Unreachable code*/

    /*//Out put  = 1
    try{
        return 1;
    }catch(Exception e){

    }
    return 10;*/

    //this method Must Return a Value
    try{
        
    }catch(Exception e){
        return 1;
    }
}
 public static void main(String[] args) {
     ReturnWithTryCatch obj = new ReturnWithTryCatch();
     System.out.println(obj.calc());
 }  
}