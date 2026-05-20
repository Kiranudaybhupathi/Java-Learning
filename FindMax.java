import java.util.Scanner;

public class FindMax {
    public static int findMax(int a, int b){
        if(a>b){
            return a;
        }
        else {
            return b;

        }
    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=0;i<n;i++){
          max=findMax(max,a[i]);

        }
        System.out.print("Maximum " +max);
    }


}
