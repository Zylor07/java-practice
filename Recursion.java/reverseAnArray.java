public class reverseAnArray {
    public static void reverseUsingPointer(int i,int arr[]){
        int temp;
          if(i>=arr.length/2){
            return ;
          }
          
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
          
          reverseUsingPointer(i+1, arr);

    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        reverseUsingPointer(0, arr);
        for(int i: arr){
            System.out.println(i+" ");
        }
    }
    
}
