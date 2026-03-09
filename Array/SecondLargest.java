public class SecondLargest {

    public static int solution(int arr[]){

        int largest = arr[0];
        int secondLargest = -1;

        for(int i = 1; i < arr.length; i++){

            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }

            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int arr[] = {1,5,3,6,12,6,7};

        System.out.println(solution(arr));
    }
}