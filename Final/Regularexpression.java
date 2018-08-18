class Regularexpression{
	public static void main(String[] args) {
		String regex = "^((https?|ftp|smtp)://)?(www.)?[a-z0-9]+.[a-z]+(/[a-zA-Z0-9?]+[a-zA-Z0-9=]+[a-zA-Z0-9]+/?)*$";
		String val = "https://www.sample123.com/userservlet?id=101";

		if(val.matches(regex)){
			System.out.println("Valid");
		}else{
			System.out.println(" Not Valid");
		}
	}
}