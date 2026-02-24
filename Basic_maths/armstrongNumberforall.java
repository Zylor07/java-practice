public class armstrongNumberforall {
    public boolean  isArmstrong(int N){
        int original=N;
        int digits=String.valueOf(N).length();
        int sum=0;
        while(N>0){
            int lastdigit=N%10;
            sum+=Math.pow(lastdigit, digits);
            N/=10;

        }
        return original==sum;

    }
    public static void main(String[] args) {
        int num=1634;
        armstrongNumberforall obj=new armstrongNumberforall();
        if(obj.isArmstrong(num)){
            System.out.println("this an armstrong number");
            
        }
        else
            System.out.println("this is not an armstrong number");
    }
}
