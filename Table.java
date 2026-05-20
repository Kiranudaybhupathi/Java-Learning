import java.util.*;
public class Table {
    public static int printTable(int a ,int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=10;i++){
           int r=printTable(t,i);
            System.out.println(+t+ "x" + i+ "=" +r);


        }




    }


}
