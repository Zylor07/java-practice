class armstrongNumber{
    public boolean extractionOfCube(int N){
        int original=N;
        int sumOfcube=0;
        while(N>0){
            int lastdigit=N%10;
           
            sumOfcube=sumOfcube+(lastdigit*lastdigit*lastdigit);
             N=N/10;

        }
        return original==sumOfcube;

    }
    public static void main(String []args){
        int num=1634;
        armstrongNumber obj=new armstrongNumber();
        if(obj.extractionOfCube(num)){
            System.out.println("This is an armstrong number");
        }
        else
            System.out.println("This is not an armstrong number");
    }
}