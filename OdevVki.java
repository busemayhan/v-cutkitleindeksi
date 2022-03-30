package Giris;
import java.util.Scanner;
public class OdevVki {
    public static void main(String[] args) {
        //Kilo (kg) / Boy(m) * Boy(m)

        //Çıktısı
        //Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
        //Lütfen kilonuzu giriniz : 105
        //Vücut Kitle İndeksiniz : 35.49215792320173

        Scanner input=new Scanner(System.in);
        double kilo , boy;
        System.out.print("Lutfen boyunuzu metre cinsinden giriniz: ");
        boy=input.nextDouble();
        System.out.print("Lutfen kilonuzu kilogram cinsinden giriniz: ");
        kilo=input.nextDouble();

        double vki = (kilo / (boy*boy));
        System.out.print("Vucut kitle indeksiniz: "+ vki);
    }
}
