import java.util.Scanner;

public class Practice_Arithmetic_Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üç adet sayı giriniz: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        System.out.println("Sonuç: " + ((num2 * num3) + num1 - num3));
    }
}
