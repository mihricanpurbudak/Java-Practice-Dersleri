package day6_practise;

import java.util.Arrays;

public class Q05_Arrays {
    /*
       given an int array and find the squares of the elements
       (Verilen bir int dizisi icin elemanlarin karelerini bulun )
       Example:{2,6,4,5,8,9}
       output:{4,36,16,25,64,81}
       */
    public static void main(String[] args) {
        int arr [] = {2,6,4,5,8,9};
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }
        System.out.println(Arrays.toString(arr)); //[4, 36, 16, 25, 64, 81]
    }
}
//arraylerde tüm data tipleri aynı olması lazım
//arraylerin uzunlugu bize icindaki eleman sayisini verir
//arrayler heap memory de run time da olusturulur
//arrayler non primitivedir , bu yüzden kendilerine özel methodları vardır
//bir array i declare ederken referansları stack memory de olusur


//public static void main(String[] args) {

        //int arr[] = {2,6,4,5,8,9};

        //ben butun integer arrayimdeki elemanlara ulasmak istiyorum bunu da for döngüsü ile sağlarım
        //for (int i = 0; i <arr.length ; i++) { //ben 0 ıncı indexten baslarım arrayimin uzunluguna kadar giderim
        //arr[i]*=arr[i]; //array in tüm elemanlarınının karelerini aldık yani su islemi yaptık
        //arr[i]=arr[i]*arr[i]


        //System.out.println(Arrays.toString(arr)); //sadece arr yazsak referans nosunu alırız, [4, 36, 16, 25, 64, 81]

