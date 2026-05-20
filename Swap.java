import java.util.*;
public class Swap {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a=sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b=sc.nextInt();
        System.out.print("After Swap Number ");
        int temp =a;
        a=b;
        b=temp;
        System.out.println("a:" +a + " b:"+b);
        sc.close();

    }

}
