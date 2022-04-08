package fibonacciSerisi;

public class Main {
    public static void main(String[] args){

        int n1=0,n2=1,total=0,scale=8;
        total=n1+n2;

        for (int i = 0; i <= scale; i++){
            n1=n2;
            n2=total;

            total=n1+n2;
            System.out.println(n2);
        }
    }
}
