import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        //ATM projesi

        Scanner in = new Scanner(System.in);
        int bakiye = 10000,miktar,giris,tutar;

        //GİRİŞ KISMI
        System.out.println("-----MERHABA KARA BANKASINA HOŞ GELDİNİZ!----");
        System.out.println("BAKİYENİZ: " + bakiye + " TL");

        while (bakiye > 0){
            //KULLANICIYA ATM DE YAPMAK İSTEDİĞİ İŞLEM İÇİN BİLGİ VERİLİR
            System.out.println();
            System.out.println("1-)PARA YATIR ");
            System.out.println("2-)PARA ÇEKİNİZ");
            System.out.println("3-)BAKİYE SORGULA");
            System.out.println("4-)ÇIKIŞ YAPINIZ");
            System.out.print("YUKARIDA YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ :");
            giris = in.nextInt();

            if(giris == 1){
                System.out.print("YATIRMAK İSTEDİĞİNİZ TUTARI GİRİNİZ: ");
                miktar = in.nextInt();
                bakiye += miktar;
            } else if (giris == 2) {
                System.out.print("ÇEKMEK İSTEDİĞİNİZ TUTARI GİRİNİZ: ");
                miktar = in.nextInt();
                bakiye -= miktar;
                if(miktar>bakiye){      //KULLANICI FAZLA PARA ÇEKTİRMEK İSTEDİĞİ SIRA KONTROL SAĞLANIR
                    System.out.println("YETERSİZ BAKİYE!,LÜTFEN TEKRAR DENEYİNİZ ");
                }

            } else if (giris == 3) {
                System.out.println("BAKİYENİZ: "+bakiye);
            } else if (giris == 4) {
                System.out.println("TEKRAR BEKLERİZ,İYİ GÜNLER :)");
                break;      //BREAK KULLANARAK İŞLEM SONLANIR
            }
            else {      //KULLANICI YUKARIDAKİ SAYILARDAN FARKLI SAYI GİRDİĞİ TAKDİRDE HATA VERİR
                System.out.println("LÜTFEN YAPACAĞINIZ İŞLEMİ DOĞRU SEÇTİĞİNİZDEN EMİN OLUNUZ!");

            }

        }
        in.close();
    }

}
