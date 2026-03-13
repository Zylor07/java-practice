//BruteForce
public class MaximumXorOFtwoNumbers {
  
    public static void main(String[] args)
    {
        int arr[] = {3,10,5,25,2,8};

        int maxXor = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                int xor = arr[i] ^ arr[j];

                maxXor = Math.max(maxXor, xor);
            }
        }

        System.out.println(maxXor);
    }
}
    

