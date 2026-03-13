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
  //uses java built in function  
/*
public class Main
{
    public static void main(String[] args) {

        int n = 7;
        int count = 0;

        for(int i = 1; i <= n; i++){
            count += Integer.bitCount(i);
        }

        System.out.println(count);
    }
} */

