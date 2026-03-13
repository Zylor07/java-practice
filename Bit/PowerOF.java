public class PowerOF {
    	public static void main(String[] args) {
		int n=8;
		
	if(n>0 && (n&(n-1))==0){
	    int exponent = (int) (Math.log(n) / Math.log(2));
	    System.out.println("power of two : "+ exponent);
	}
	else
	  System.out.println("Not the power of two");
 }
    
}
