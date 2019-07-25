public class Demo1 {
    public static void main( String[] args ) {
        int g=count(5);
        System.out.println(g);
    }
    public static int count(int i){
        if(i==1){
            return i;
        }
        return i+count(i-1);
    }

    public static int Multiply(int n){
        int result=1;
        if(n>1)
            result = n*Multiply(n-1);
        return result;
    }
}
