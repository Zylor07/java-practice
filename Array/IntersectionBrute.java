import java.util.ArrayList;

public class IntersectionBrute {

    public static void solution(int arr1[], int arr2[]) {

        ArrayList<Integer> result = new ArrayList<>();
        boolean visited[] = new boolean[arr2.length];

        for(int i = 0; i < arr1.length; i++){

            for(int j = 0; j < arr2.length; j++){

                if(arr1[i] == arr2[j] && !visited[j]){

                    result.add(arr1[i]);
                    visited[j] = true;
                    break;
                }
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {

        int arr1[] = {1,2,2,3,4};
        int arr2[] = {2,2,3,5};

        solution(arr1, arr2);
    }
}