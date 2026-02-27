public class reverseAnarray2pointer {
    public static void reverse(int j,int l,int arr[]){
        int temp;
        if(j>=l){
            return;
        }
        temp=arr[j];
        arr[j]=arr[l];
        arr[l]=temp;
        reverse(j+1,l-1,arr);

        

    }
    public static void main(String[] args) {
          int []arr={1,2,3,4,5};
          reverse(0,arr.length-1,arr);
          for(int i:arr){ 
            System.out.println(i+" ");
        }
         
    }
    
}
