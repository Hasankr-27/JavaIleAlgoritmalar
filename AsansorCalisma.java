import java.util.Scanner;

public class AsansorCalisma {
    public static void main(String[] args) {
        //Asansor calisma sistemi kac saat sonra hedef kata ulasacagi belirlenir
        Scanner input = new Scanner(System.in);

        //Binanin kac katli oldugu girilir
        System.out.print("Bina kac katli: " );
        int bina = input.nextInt();

        System.out.println("------------------------");

        //Asansor kacinci katta oldugu girilir
        System.out.print("Asansor kacinci katta:");
        int asansor = input.nextInt();

        System.out.println("------------------------");

        //Asansore bineceginiz katin numarasini girecek kisi
        System.out.print("Kacinci kattasiniz: ");
        int bulunduguKat = input.nextInt();

        System.out.println("------------------------");

        //Gidecegi kati girmesi istenir
        System.out.print("Gideceginiz kati girin: ");
        int hedefKat = input.nextInt();

        while (asansor>=0 && bulunduguKat>=0 && hedefKat>=0 && bina>0) {
            if (bina >=  asansor && bina >= hedefKat && bina>=bulunduguKat){
                //Once asansor cagrilir
                int geldigiAdimSayisi = asansor-bulunduguKat;

                int gidecegiAdimSayisi = hedefKat-bulunduguKat;

                int toplamAdimSayisi = Math.abs(gidecegiAdimSayisi)+ Math.abs(geldigiAdimSayisi);

                if (toplamAdimSayisi>=0){

                    System.out.println();
                    System.out.println();
                    //Sonucu ekrana cikartma
                    System.out.println("--------------------------------");
                    System.out.printf("Bina                  :%d katli\n",bina);
                    System.out.printf("Asansor               :%d.katta\n",asansor);
                    System.out.printf("Kisinin bulundugu kat :%d.kat\n",bulunduguKat);
                    System.out.printf("Cikacagi kat          :%d.kat\n",hedefKat);
                    System.out.printf("Sonuc:  Asansor %d kez calisti",toplamAdimSayisi);
                }

                break;
            }
            System.out.println();
            System.out.println("Girdiginiz bilgilerde hata var,lütfen tekrar deneyiniz!");
            break;
        }

    }

}
