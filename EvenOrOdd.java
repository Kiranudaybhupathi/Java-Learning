import java .util.*;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.print(+n+ " is Even Number");
        }
        else{
            System.out.print(+n+ " is Odd Number");
        }
        sc.close();
    }

}
