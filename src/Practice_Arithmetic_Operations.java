// Program kullanıcıdan üç girdi sayı alıp işlem sırasına göre sonucu hesaplar ve ekrana bastırır

import java.util.Scanner;

public class Practice_Arithmetic_Operations {
    public static void main(String[] args) {
        // Scanner ile kullanıcıdan girdi alındı
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        double num1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double num2 = input.nextDouble();
        System.out.print("Üçüncü sayıyı giriniz: ");
        double num3 = input.nextDouble(); 
        // Sonucun hesaplanıp bastırılması
        System.out.println("Sonuç: " + ((num2 * num3) + num1 - num3));
    }
}
