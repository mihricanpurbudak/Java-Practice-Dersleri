package dayTraining;

import java.util.Scanner;

public class day_02 {
    public static void main(String[] args) {
        /*kullanicidan 10 dan kucuk bir tamsayi isteyin ve girilen sayinin faktoriyel ini bulunuz
        (5!=5*4*3*2*1)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 10 dan kucuk bir tamsayi giriniz: ");
        int sayi=scan.nextInt();
        int sonuc=1;
        for (int i = 1; i <=sayi ; i++) {
            sonuc*=i;


        }
        System.out.println("sonuc="+sonuc);
    }
}
