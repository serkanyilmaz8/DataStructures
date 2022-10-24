package BagliListe;

public class Main {
    public static void main(String[] args) {
        BagliListe liste = new BagliListe();

        liste.basaEkle(10);
        liste.basaEkle(5);
        liste.sonaEkle(15);
        liste.basaEkle(0);

        liste.bastanYazdir();
        System.out.println();
        liste.verilenIndexeEkle(2,8);
        liste.bastanYazdir();
        System.out.println();
        liste.verilenIndexeEkle(4, 12);
        liste.bastanYazdir();
        System.out.println();
        liste.sil(15);
        liste.bastanYazdir();
        //liste.sondanYazdir();


    }
}
