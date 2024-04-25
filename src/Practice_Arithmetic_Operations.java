// Program kullanıcıdan üç girdi sayı alıp işlem sırasına göre sonucu hesaplar ve ekrana bastırır

import java.util.Scanner;

public class Practice_Arithmetic_Operations {
    public static void main(String[] args) {
        // Scanner ile kullanıcıdan girdi alındı
        Scanner input = new Scanner(System.in);
        System.out.print("Üç adet sayı giriniz: ");
        // Boşlukla ayrılan sayılar art arda kullanılan nextDouble ile alındı
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        // Sonucun hesaplanıp bastırılması
        System.out.println("Sonuç: " + ((num2 * num3) + num1 - num3));
    }
}
