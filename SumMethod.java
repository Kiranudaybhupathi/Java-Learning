import java.util.*;
public class SumMethod {
    public static int sum(int a,int b){
        return a+b;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int [] a=new int[n];
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
       int t=0;
       for(int i=0;i<n;i++){
           t=sum(t,a[i]);
       }
       System.out.print("Sum " + t);


    }

}
