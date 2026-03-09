public class leftRotateByOne {

    public void rotate(int[] nums){

        int temp = nums[0]; // store first element

        for(int i = 1; i < nums.length; i++){
            nums[i-1] = nums[i]; // shift left
        }

        nums[nums.length - 1] = temp; // place first element at end
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        leftRotateByOne obj = new leftRotateByOne();
        obj.rotate(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}