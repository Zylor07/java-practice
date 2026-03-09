public class MoveZero {

    public static void mvZro(int []arr){

        int j = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] != 0){

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        int n[] = {4,0,3,0,6,0,1,7,8};

        mvZro(n);

        for(int num : n){
            System.out.print(num + " ");
        }
    }
}