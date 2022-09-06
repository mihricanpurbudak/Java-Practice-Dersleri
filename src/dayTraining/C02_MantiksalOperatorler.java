package dayTraining;

public class C02_MantiksalOperatorler {
   /* mantiksal operatorler
   1-!(not kullanimi :(3>4)---->true
   2-&&(and)  verilen iki degiskenin de dogru olmasi gerekir ki true versin yoksa herhangibirinin yanlis olmasi sonucu false verir
   && sonrakileri kontrol etmez bir false varsa false verir sonucu
   & ancak bu isaret yine de hepsini kontrol eder bu nedenle daha  yavas calisir

   (3>5) && ("team11"=="team11")------>false

   3-|| (or) veya ---->verilen halinde sonucumuzu true
    yalnizca iki degiskenimizin de yanlis olmasi halinde sonucumuz false olur
    herhangi birisinin dogru olmasi
    */

    public static void main(String[] args) {
        System.out.println("sonuc" + ((3 > 4) && ("team11" == "team11")));
    }
}