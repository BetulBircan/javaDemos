public class Main {

    public static void main(String[] args) {
        DortIslem dortislem = new DortIslem();
        int toplama = dortislem.Topla(6, 6);
        System.out.println("Toplam: " + toplama);
        int cikartma = dortislem.Cikar(6, 6);
        System.out.println("Çıkartma: " + cikartma);
        int carpma = dortislem.Carp(6, 6);
        System.out.println("Çarpma: " + carpma);
        int bolme = dortislem.Bol(6, 6);
        System.out.println("Bölme: " + bolme);

    }
}
