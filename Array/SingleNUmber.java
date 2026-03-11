public class SingleNUmber {
    

    public static int solution(int arr[]){
        int xor = 0;

        for(int i = 0; i < arr.length; i++){
            xor = xor ^ arr[i];
        }

        return xor;
    }

    public static void main(String[] args) {

        int arr[] = {4,1,2,1,2};

        System.out.println(solution(arr));
    }
}
    
//Brute force approch
/*public static int solution(int arr[]){
    for(int i=0;i<arr.length;i++){
        int count = 0;

        for(int j=0;j<arr.length;j++){
            if(arr[i] == arr[j]){
                count++;
            }
        }

        if(count == 1){
            return arr[i];
        }
    }

    return -1;
} */
