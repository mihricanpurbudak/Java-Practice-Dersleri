package day6_practise;

public class Q08_Arrays {
    /*
     * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
     * yazdiran bir method yaziniz
     * int[] arr= {5,7,-6,4,2,15,3,8,1};
     * int istenenToplam=9;
     */
    public static void main(String[] args) {
        int arr[] = {5,7,-6,4,2,15,3,8,1};
        int istenenToplam = 9;
        arrMethod(arr,istenenToplam);

    }
    private static void arrMethod(int[] arr, int istenenToplam) {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i] + arr[j]==9 ){
                    System.out.println(arr[i] +" ve " + arr[j] + " toplam :"+ istenenToplam);
                }
            }
        }
    }
}
 /*
        j=i+1 ve j=i:   5 ve 4 toplam :9
                        7 ve 2 toplam :9
                        -6 ve 15 toplam :9
                        8 ve 1 toplam :9
        j=0;    5 ve 4 toplam :9
                7 ve 2 toplam :9
                -6 ve 15 toplam :9
                4 ve 5 toplam :9
                2 ve 7 toplam :9
                15 ve -6 toplam :9
                8 ve 1 toplam :9
                1 ve 8 toplam :9
         */



//o zaman kullanicidan array in boyutunu alacağız, sonra elemanları almamız lazım
//sonra bu aldığımız 8 elemanlı array in icerisinde kac tanesi 3 e bölünebiliyor
//  bütün elemanları kontrol etmek icin for döngüsü lazım
// sart oldugu icin if gerekli
// ve kac tane dediği icin count gerekli bu soru icin





//nested for kullaniriz, cunku iki defa sayiları kontrol edeceğiz, iki tane toplanan oldugu icin nested kullanırız
//tek tek elemanları gezeceğiz 9 a esit olanları bulacağız

       // int[] arr={5,7,-6,4,2,15,3,8,1}; //integer array imi olusturdum
        //int istenenToplam=9;

        //for (int i = 0; i <arr.length ; i++) {//ilk toplananı alıyoruz
        //for (int j = i+1; j <arr.length ; j++) {//ikinci toplananda i+1 yaparız cünku ikinci toplananları sececeğiz
        //i+1 yerine 0 yazarsak sayı ciftlerinin ters toplamlarını da alır yani iki kere yazdırır --> 4+5-5+4
        //j=i+1 yerine sadece j=i yazsakta sonuc aynı olur, iki yolda doğrudur.

        //if (arr[i]+arr[j]==9) {//arrayin ilk fordan aldığımız elemanı i/ikinci fordan aldığımız elemanı j
        //ilk toplanan ile ikinci toplananın toplamları 9 a esit ise
        //System.out.println(arr[i]+" ve " + arr[j] + "toplam: " + istenenToplam);









