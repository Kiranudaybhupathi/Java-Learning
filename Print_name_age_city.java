import java.util.*;
public class Print_name_age_city {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name:");
        String name = sc.nextLine();
        System.out.print("Enter Your Age:");
        int age = sc.nextInt();
        System.out.print("Enter Your City:");
        String city = sc.nextLine();
        sc.nextLine();
        System.out.println("Name : " + name + "\nAge : " + age + "\nCity : " + city);
sc.close();
    }
}
