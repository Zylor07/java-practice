public class InsertionSort {

    public static int[] solution(int[] arr){

        for(int i = 1; i < arr.length; i++){

            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] num = {5,4,7,8,3,10,1};

        int[] result = solution(num);

        for(int n : result){
            System.out.print(n + " ");
        }

    }
}