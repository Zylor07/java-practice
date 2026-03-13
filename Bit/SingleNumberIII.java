public class SingleNumberIII
{
	public static void main(String[] args) {

	    int arr[] = {1,2,1,3,2,5};
	    int n = 0;

	    for(int i = 0; i < arr.length; i++){
	        n ^= arr[i];
	    }

	    int rightmost = (n & (-n));

	    int num1 = 0;
	    int num2 = 0;

	    for(int num : arr){
	        if((num & rightmost) != 0)
	            num1 ^= num;
	        else
	            num2 ^= num;
	    }

	    System.out.println(num1 + " " + num2);
	}
}