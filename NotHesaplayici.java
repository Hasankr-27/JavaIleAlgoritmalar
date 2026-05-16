import java.util.Scanner;

public class NotHesaplayici {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double toplamNot = 0;

        int i = 0;

        while (i < 5){
            System.out.println("Lütfen 0 ile 100 aralğında sayı giriniz: ");
            int notGir = input.nextInt();

            if(notGir>=0 && notGir<=100){
                toplamNot +=  notGir;
                i++;
            }
            else {
                System.out.println("Hata:İstenilen aralıkta sayı girmediniz!");
            }
        }

        toplamNot = toplamNot / 5;
        
        if(toplamNot >= 85){
            System.out.println("SONUCUNUZ: " + toplamNot + " AA ile geçildi");
        } else if (85 >= toplamNot && 65 <= toplamNot) {
            System.out.println("SONUCUNUZ: " + toplamNot + " BB ile geçildi");
        }else if (65 >= toplamNot && 50 <= toplamNot) {
            System.out.println("SONUCUNUZ: " + toplamNot + " CC ile geçildi");
        }else {
                System.out.println("SONUCUNUZ: " + toplamNot + " FF ile kalındı");
        }

    }
}
