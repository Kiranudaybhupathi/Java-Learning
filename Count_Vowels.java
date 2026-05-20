import java.util.Scanner;
public class Count_Vowels {
    public static int countVowels(String s){
        int count=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' ||c=='o' || c=='u' ){
                count++;
            }

        }
        return count;

    }
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
      System.out.print("Enter a String:");
      String a=sc.nextLine();
      int result=countVowels(a);
      System.out.print("Number of Vowels:"+result);

    }

}
