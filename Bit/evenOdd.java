

public class evenOdd {

    public  void evenOddNormal(int n){
        if(n%2==0){
            System.out.println("even");
        }
        else
            System.out.println("odd");
    }


    public void evenOddBit(int n){
        if((n & 1)==0){
            System.out.println("even");
        }
        else
            System.out.println("odd");
    }
    public static void main(String[] args) {
        evenOdd obj=new evenOdd();
       
        obj.evenOddBit(7);
        obj.evenOddNormal(7);
    }
    
}
