import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                  11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                  21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                  31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                  41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                  51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                  61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                  71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                  81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                  91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

        //Sayıları ekrana yazdırma
        System.out.println("---------- SAYI TABLOSU ----------");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%4d", numbers[i]); // Her sayıya 4 karakterlik yer ayırır

            // Her 10 sayıda bir alt satıra geç (10, 20, 30...)
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("----------------------------------");


        int high = 100,low = 1,sayac = 0,mid;
        System.out.print("1'den 100'e kadar sayı seçiniz:");
        int sayi = input.nextInt();

        //Secilen sayı kontrolu
        if(sayi >= 1 && sayi <= 100) {
            //While dongusu ile binary arama yapiyoruz
            while (low <= high) {
                sayac++;

                mid = (low + high) / 2;

                if (sayi == numbers[mid]) {
                    System.out.println(sayac + ".ADIMDA" + " BULUNDU");
                    break;
                } else if (sayi > numbers[mid]) {
                    //Sayi mid'den buyuk oldugu icin sol taraf silinir
                    low = mid + 1;
                } else {
                    //Sayi mid'den kucuk oldugu zaman ise sag taraf silinir
                    high = mid - 1;
                }
            }
        }
        else{
            System.out.println("HATALI GİRDİNİZ!");
        }


    }
}
