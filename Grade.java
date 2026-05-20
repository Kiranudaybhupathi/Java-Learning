import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.print("A Grade");
        } else if (score > 70) {
            System.out.print("B Grade");


        } else if (score >= 50 && score< 70) {
            System.out.print("C Grade");
        } else if (score >= 35 && score< 50) {
            System.out.print("D Grade");

        } else {
            System.out.print("F Grade");
        }
        sc.close();
    }
}

