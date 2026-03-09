public class leftRotatebyKplace {
    

    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        for(int t = 0; t < k; t++){

            int temp = nums[0];

            for(int i = 1; i < nums.length; i++){
                nums[i-1] = nums[i];
            }

            nums[nums.length-1] = temp;
        }
    }

public static void main(String[] args) {
    
        int[] arr = {1,2,3,4,5};

        leftRotatebyKplace obj = new leftRotatebyKplace();
       obj.rotate(arr, 3);

        for(int i : arr){
            System.out.print(i + " ");
        }
}

    
}
