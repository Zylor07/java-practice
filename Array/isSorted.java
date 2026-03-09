public class isSorted {

    public static boolean sortCheck(int []arr){

        for(int i = 0; i < arr.length - 1; i++){

            if(arr[i] > arr[i+1]){
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        int []n = {1,2,3,4,5,7,6};

        System.out.println(sortCheck(n));
    }
}