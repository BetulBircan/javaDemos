public class Main {

    public static void main(String[] args) {
	// methods' continue
        String mesaj = "Bugün Hava Çok Güzel.";
    //  String yeniMesaj = mesaj.substring(0,2);
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5, 7);
        System.out.println("Toplam: " + sayi);
    }

    //method isimlerndirmeleri küçük harfle başlar. camelCase yöntemi kullanılır
    public static void ekle() {
        System.out.println("Eklendi");
    }

    //void yönteminde geriye değer dömdürmez sadece istenilen işlemi yapar
    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    //burada int değeri döndürür return ile
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static String sehirVer() {
        return "İstanbul";
    }
}
