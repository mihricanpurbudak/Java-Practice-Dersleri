package day04_practice;

import java.util.Scanner;

public class Q03_MethodCreotion {
     /*
Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
   0-1-1-2-3-5-8-13-21-34....
*/

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("47 den kucuk bir tamsayi giriniz:");

        int sayi= scan.nextInt();
        fibionacci(sayi);


    }

    private static void fibionacci(int sayi) {
        int sayi1=0;
        int sayi2=1;
        int sayi3;
        System.out.println(sayi1+ " ");
        System.out.println(sayi2 +" ");
        if (sayi<47) {
            for (int i = 2; i < sayi; i++) {
        sayi3= sayi1+sayi2;
                System.out.println(sayi3 + " ");
                sayi1=sayi2;
                sayi2=sayi3;


            }
        }else System.out.println("47 de kucuk bir sayi giriniz");

        }
    }


