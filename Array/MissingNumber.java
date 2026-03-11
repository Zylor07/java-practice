public class MissingNumber {
    public static  int solution(int arr[]){
        for(int i=1;i<=arr.length;i++){
           int flag=0;
            for(int j=0;j<=arr.length-1;j++){
                if(arr[j]==i){
                    flag=1;
                    break;

                }

            }
            if(flag==0){
                return i;
            }

        }
        return 0;
    }
    public static void main(String[] args) {
        int []arr1={1,2,3,5};
        System.out.println(solution(arr1));


    }
    
}

//much better solution

/*public class MissingNumber {
    public static int solution(int arr[]){
        int n = arr.length + 1;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for(int i=0;i<arr.length;i++){
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }
} */