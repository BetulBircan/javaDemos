# Parametreli Methodlar ve Variable Arguments Kullanımı
Metotların bir diğer varyasyonu, herhangi bir türden bir veya daha fazla parametre almasıdır. Girilecek olan parametre sayısı için bir sınır yoktur. Parametreler integer, String, char, double gibi herhangi bir türden olabilir.

Java'daki Değişken Argümanlar (Varargs), değişken sayıda argüman alan bir yöntemdir. Java'daki Değişken Argümanlar, değişken sayıda argüman alması gereken yöntemlerin oluşturulmasını basitleştirir.

```
 public static int topla2(int... sayilar) {
        int toplam = 0;

        for(int sayi : sayilar) {
            toplam += sayi;
        }

        return toplam;
    }
```



```
public class Main {

    public static void main(String[] args) {
	// methods' continue
        String mesaj = "Bugün Hava Çok Güzel.";
    //  String yeniMesaj = mesaj.substring(0,2);
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5, 7);
        System.out.println("Toplam: " + sayi);
        int toplam = topla2( 2, 3, 4, 5, 6, 10);
        System.out.println("Sayılar Toplamı: " + toplam);
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

    //burada istediğimiz kadar sayıları toplayabilmek için variable arguments kullanırız
    public static int topla2(int... sayilar) {
        int toplam = 0;

        for(int sayi : sayilar) {
            toplam += sayi;
        }

        return toplam;
    }

    public static String sehirVer() {
        return "İstanbul";
    }
}

```

![parametrelimetodsonuc](https://user-images.githubusercontent.com/86554799/192359688-e3bac31b-1f64-40e0-a66f-dd096644e562.png)


