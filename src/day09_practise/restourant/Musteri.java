package day09_practise.restourant;

public class Musteri {


    public static void main(String[] args) {

        Mutfak menu =new Mutfak();

        System.out.println("menu.toString() = " + menu.toString());

        Mutfak siparisim=new Mutfak("adanakebab","mercimek","kunefe","salgam");

        System.out.println("siparisim = " + siparisim);



    }
}