public class seletionSort {
    public static void sorting(int []arr){
        int temp;

        for(int i=0;i<arr.length-1;i++){
            int min =i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                   
                }

            }
             temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;


        }
        for(int nums:arr){
            System.out.println(nums);
        }
        /*for(int i=arr.length-1;i>=0;i--){       
            System.out.println(arr[i]);        //this is for reverse printing

        */
    }
    public static void main(String[] args) {
        int arr[]={87,67,45,90,100};
        sorting(arr);
        
    }
    
}
