
public class LargestElement {
    public static int maxx(int []arr){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];

            }
        }
          return largest;
    }
    public static int count(int arr[]){
        int totalCount=0;
         for(int i=0;i<arr.length;i++){
            totalCount++;          //This works but is unnecessary.    Because arrays already provide: arr.length
            
        }
        return totalCount;
    }
    public static int minimum(int arr[]){
        int mini=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<mini){
                mini=arr[i];

            }
        }
        return mini;
    }
    public static int summ(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(arr.length == 0){
    return -1;
}
        return sum;
    }
   
  public static void main(String[] args) {

    int []n = {1,5,3,6,12,6,7};

    System.out.println("Max: " + maxx(n));
    System.out.println("Count: " + n.length);
    System.out.println("Min: " + minimum(n));
    System.out.println("Sum: " + summ(n));
}
}
//brute force will be sort and return the last element remember quick sort will be efficient with time complexity but heavy in space complexity
