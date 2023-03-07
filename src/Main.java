import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Line Comparison Computation Program!");

        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        System.out.println("Please enter x1 number");
        int y1 = sc.nextInt();
        System.out.println("Please enter y1 number");
        int x2 = sc.nextInt();
        System.out.println("Please enter x2 number");
        int y2 = sc.nextInt();
        System.out.println("Please enter y2 number");

        double length = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("the length of the line is "+ length);



    }
}