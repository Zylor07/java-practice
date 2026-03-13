public class BitCount {
   
    public static void main(String[] args) {

        int arr[] = {3,5,7};

        for(int num : arr){

            int count = 0;
            int n = num;

            while(n > 0){
                n = n & (n-1);
                count++;
            }

            System.out.println(num + " -> " + count);
        }
    }
}
    

