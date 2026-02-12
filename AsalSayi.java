import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Burada sayaç yerine boolean kullandık çünkü sayaç hafızayı doldurur boolean daha az veri harcar
        boolean asalMi = true;

        //Kullanıcıdan sayı alıyoruz
        System.out.print("Asal olup olmadığını kontrol etmek için istediğiniz sayıyı giriniz: ");
        int asal = input.nextInt();

        //Sayı 2 ve üzeri eşitse kontrol eder.Eğer sayı 2 den küçükse otomatikmen asal olma imkanı yoktur
        if (asal>=2) {
            /*Döngü açıp girilen sayının yarısına bölüp küçük eşit yaparak döngü döner.
            Örnek:11 girildiğinde 11 e geldiğinde sayı bölünecek ve asal olmadığını söyle program
            ama yarısında kadar geldiğinde int değeri alınarak bölünmeyeceğini anlayıp asal olarak kabul edecek
            */
            for (int i = 2; i <= asal / 2; i++) {
                if (asal % i == 0) {
                    //Yukarıda true dediğimiz boolean şimdi false oldu çünkü burada asal olmadığını gösterir
                    asalMi = false;
                    break;
                }
            }
            //Bundan sonraki karar yapısında true olarak sayar nedeni yukarıda asalMi değişkenine true değeri atamıştık
            if (asalMi) {
                System.out.println(asal + " asal sayıdır");
            }
            //Burada ise yukarıdaki döngüde false kararı buraya iner.
            else {
                System.out.println(asal + " asal sayı değildir");
            }
        }
        //Kişi burada 2 den küçük sayı girdiğinde ekrana çıkan çıktıdır
        else {
            System.out.println("Girdiğiniz sayı asal sayı değildir!");
        }
    }
}
