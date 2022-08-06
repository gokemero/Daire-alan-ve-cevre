import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin yarıçapını giriniz :");
        int a = input.nextInt();
        System.out.print("\nÜçgenin merkez açısını giriniz :");
        int b = input.nextInt();
        double cevre = ((2*3.14*a)/360*b) + (2*a);
        System.out.print("\nDaire diliminin çevresi :"+ cevre);
        double alan = (3.14*a*a)/360*b;
        System.out.println("\nDaire diliminin alanı :"+ alan);
    }
}
