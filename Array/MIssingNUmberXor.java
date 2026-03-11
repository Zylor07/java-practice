public class MIssingNUmberXor {

    public static int solution(int arr[]) {

        int xor1 = 0;
        int xor2 = 0;

        // XOR of array elements
        for(int i = 0; i < arr.length; i++){
            xor1 ^= arr[i];
        }

        // XOR of numbers from 1 to n
        for(int i = 1; i <= arr.length + 1; i++){
            xor2 ^= i;
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,5};

        System.out.println(solution(arr));
    }
}