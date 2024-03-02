import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);  // random bir sayı oluşturulur.

        Scanner input = new Scanner(System.in);

        int right = 0;
        int[] tahmin = new int[10];


        // 10 giriş hakkı tanınır.
        // Kullanıcıdan sayı alınır.
        //İstenilen sayı bulunduğunda yapılan tahminler ekrana yazılır.

        while (right < 10) {
            System.out.print("0 ile 100 arasında bir sayi giriniz: ");
            int sayi = input.nextInt();

            if (sayi < 0 || sayi > 100) {
                System.out.println("İstenilen aralıktan farklı sayı girdiniz.");
                continue;
            }
            if (number == sayi) {
                System.out.println("Tebrikler, tahmininiz doğru");
                System.out.println("Tahminleriniz: " + Arrays.toString(tahmin));
                break;

            } else {
                System.out.println("Tahmininiz yanlış tekrar deneyiniz");
                if (sayi > number) {
                    System.out.println("Girdiğiniz sayı gizli sayıdan büyüktür");
                } else {
                    System.out.println("Girdiğiniz sayı gizli sayıdan küçüktür");
                }
            }
            tahmin[right] = sayi;
            right++;
            System.out.println("Kalan tahmin hakkınız " + (10 - right));

        }
    }
}