public class Main {

    public static void main(String[] args) {
        DortIslem dortislem = new DortIslem();
        int toplama = dortislem.topla(6, 6);
        System.out.println("Toplam: " + toplama);
        int cikartma = dortislem.cikar(6, 6);
        System.out.println("Çıkartma: " + cikartma);
        int carpma = dortislem.carp(6, 6);
        System.out.println("Çarpma: " + carpma);
        int bolme = dortislem.bol(6, 6);
        System.out.println("Bölme: " + bolme);

    }
}
